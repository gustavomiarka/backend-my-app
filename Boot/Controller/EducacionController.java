
package com.ejemplo.Spring.Boot.Controller;

import com.ejemplo.Spring.Boot.model.Educacion;
import com.ejemplo.Spring.Boot.security.controller.Mensaje;
import com.ejemplo.Spring.Boot.service.IEducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://proyecto-portfolio-45fee.web.app")
public class EducacionController {
    
    @Autowired
    IEducacionService eduServ;
    
    //Educacion
    
    @PostMapping("/new")
    public void agregarEducacion(@RequestBody Educacion educ){
        eduServ.crearEducacion(educ);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
    return eduServ.verEducacion();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @GetMapping("/detail/{id}")
    public Educacion getById(@PathVariable("id") long id){
    return eduServ.buscarEducacion(id);
    }
    
    @PutMapping("/update/{id}")
    public Educacion editarEducacion(@PathVariable long id, @RequestBody Educacion educ){
        Educacion educacion = eduServ.buscarEducacion(id);
        educacion.setCarrera(educ.getCarrera());
        educacion.setFechaFin(educ.getFechaFin());
        educacion.setFechaIni(educ.getFechaIni());
        educacion.setInstituto(educ.getInstituto());
        
        eduServ.crearEducacion(educacion);
        return educacion;
    }
}
