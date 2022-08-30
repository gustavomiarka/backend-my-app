
package com.ejemplo.Spring.Boot.Controller;


import com.ejemplo.Spring.Boot.model.Persona;
import com.ejemplo.Spring.Boot.service.IPersonaService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://proyecto-portfolio-45fee.web.app")
public class Controller {
    
    @Autowired 
    IPersonaService persoServ;

    
    @PostMapping("/persona/new")
    public String agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }
    
    
    @GetMapping ("/persona/ver")
    @ResponseBody
    public List<Persona> verPersona(){
    return persoServ.verPersonas();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/delete/{id}")
    public String borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    
    @GetMapping("/persona/ver/perfil")
    public Persona buscarPersona(){
        return persoServ.buscarPersona((long)1);
    }
    
    @GetMapping("/persona/detail/{id}")
    public Persona getById(@PathVariable("id") long id){
    return persoServ.buscarPersona(id);
    }
    
    
    
    @PutMapping("/persona/update/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestBody Persona per){
        Persona persona = persoServ.buscarPersona(id);
        
        persona.setNombre(per.getNombre());
        persona.setApellido(per.getApellido());
        persona.setEmail(per.getEmail());
        persona.setSobre_mi(per.getSobre_mi());
        persona.setTitulo(per.getTitulo());
        persona.setUrl_foto(per.getUrl_foto());
        
        persoServ.crearPersona(persona);
        return persona;
    }
}
