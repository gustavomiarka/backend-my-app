
package com.ejemplo.Spring.Boot.Controller;

import com.ejemplo.Spring.Boot.model.HabilidadesSoft;
import com.ejemplo.Spring.Boot.service.IHabilidadesSoftService;
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
@RequestMapping("/soft")
@CrossOrigin(origins = "https://proyecto-portfolio-45fee.web.app")
public class HabilidadesSoftController {
    @Autowired
    IHabilidadesSoftService softServ;
    
      // Habilidades Soft
    
    @PostMapping("/new")
    public void agregarHabSoft(@RequestBody HabilidadesSoft soft){
        softServ.crearHabSoft(soft);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<HabilidadesSoft> verHabSoft(){
    return softServ.verHabSoft();
    }
    
    @GetMapping("/detail/{id}")
    public HabilidadesSoft getById(@PathVariable("id") long id){
    return softServ.buscarHabSoft(id);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarHabSoft(@PathVariable Long id){
        softServ.borrarHabSoft(id);
    }
    
    @PutMapping("/update/{id}")
    public HabilidadesSoft editarHabSoft(@PathVariable long id, @RequestBody HabilidadesSoft habSoft){
        HabilidadesSoft habilidadesSoft = softServ.buscarHabSoft(id);
        habilidadesSoft.setHabilidadSoft(habSoft.getHabilidadSoft());
        habilidadesSoft.setPorcentaje(habSoft.getPorcentaje());
        
        
        softServ.crearHabSoft(habSoft);
        return habilidadesSoft;
    }
}
