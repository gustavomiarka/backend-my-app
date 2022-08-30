
package com.ejemplo.Spring.Boot.Controller;

import com.ejemplo.Spring.Boot.dto.ExperienciaLabDto;
import com.ejemplo.Spring.Boot.model.ExperienciaLab;
import com.ejemplo.Spring.Boot.security.controller.Mensaje;
import com.ejemplo.Spring.Boot.service.IExperienciaLabService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "https://proyecto-portfolio-45fee.web.app")
public class ExperienciaController {
    
     @Autowired
    IExperienciaLabService expServ;
     
      
    @PostMapping("/new")
    public void agregarExp(@RequestBody ExperienciaLab exp){
        expServ.crearExp(exp);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<ExperienciaLab> verExp(){
        return expServ.verExp();
    }
    
    @GetMapping("/detail/{id}")
    public ExperienciaLab getById(@PathVariable("id") long id){
    return expServ.buscarExp(id);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarExp(@PathVariable Long id){
        expServ.borrarExp(id);
    }
    
   
    @PutMapping("/experiencia/update/{id}")
    public ExperienciaLab editExp (@PathVariable("id") Long id,@RequestBody ExperienciaLab expLab){
        ExperienciaLab experienciaLab = expServ.buscarExp(id);
        
        experienciaLab.setNombreEmpresa(expLab.getNombreEmpresa());
        experienciaLab.setFechaIni(expLab.getFechaIni());
        experienciaLab.setFechaFin(expLab.getFechaFin());
        experienciaLab.setDescripcion(expLab.getDescripcion());
        experienciaLab.setTitulo(expLab.getTitulo());
        
        expServ.crearExp(experienciaLab);
        return experienciaLab;
    }
}
