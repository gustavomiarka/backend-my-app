
package com.ejemplo.Spring.Boot.Controller;

import com.ejemplo.Spring.Boot.model.HabilidadesHard;
import com.ejemplo.Spring.Boot.service.IHabilidadesHardService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hard")
@CrossOrigin(origins = "https://proyecto-portfolio-45fee.web.app")
public class HabilidadesHardController {
    
     @Autowired
    IHabilidadesHardService hardServ;
     
    
    @PostMapping("/new")
    public void agregarHabHard(@RequestBody HabilidadesHard hard){
        hardServ.crearHabHard(hard);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<HabilidadesHard> verHabHard(){
    return hardServ.verHabHard();
    }
    
    @GetMapping("/detail/{id}")
    public HabilidadesHard getById(@PathVariable("id") long id){
    return hardServ.buscarHabHard(id);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarHabHard(@PathVariable Long id){
        hardServ.borrarHabHard(id);
    }
    
    @PutMapping("/update/{id}")
    public HabilidadesHard editarHabHard(@PathVariable long id, @RequestBody HabilidadesHard habHard){
        HabilidadesHard habilidadesHard = hardServ.buscarHabHard(id);
        habilidadesHard.setHabilidadHard(habHard.getHabilidadHard());
        habilidadesHard.setPorcentaje(habHard.getPorcentaje());
        
        
        hardServ.crearHabHard(habHard);
        return habilidadesHard;
    }
}
