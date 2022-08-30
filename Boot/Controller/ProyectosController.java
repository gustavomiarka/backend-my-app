
package com.ejemplo.Spring.Boot.Controller;

import com.ejemplo.Spring.Boot.model.Proyectos;
import com.ejemplo.Spring.Boot.service.IProyectoService;
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
@RequestMapping("/proyecto")
@CrossOrigin(origins = "https://proyecto-portfolio-45fee.web.app")
public class ProyectosController {
      @Autowired
    IProyectoService proyecServ;
      
      //Proyectos
   
    @PostMapping("/new")
    public void agregarProyec(@RequestBody Proyectos proyec){
        proyecServ.crearProyec(proyec);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Proyectos> verProyec(){
    return proyecServ.verProyec();
    }
    
    @GetMapping("/detail/{id}")
    public Proyectos getById(@PathVariable("id") long id){
    return proyecServ.buscarProyec(id);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarProyec(@PathVariable Long id){
        proyecServ.borrarProyec(id);
    }
    
    @PutMapping("/update/{id}")
    public Proyectos editarProyec(@PathVariable long id, @RequestBody Proyectos proyec){
        Proyectos proyectos = proyecServ.buscarProyec(id);
        proyectos.setDescripcion(proyec.getDescripcion());
        proyectos.setFechaFin(proyec.getFechaFin());
        proyectos.setFechaIni(proyec.getFechaIni());
        proyectos.setLink(proyec.getLink());
        proyectos.setTitulo(proyec.getTitulo());
        
        proyecServ.crearProyec(proyec);
        return proyectos;
    }
}
