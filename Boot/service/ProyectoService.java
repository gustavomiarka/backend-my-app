
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.Proyectos;
import com.ejemplo.Spring.Boot.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
            ProyectosRepository proyectoRepo;
    
    @Override
    public List<Proyectos> verProyec() {
        return proyectoRepo.findAll();
    }

    @Override
    public void crearProyec(Proyectos proyec) {
        proyectoRepo.save(proyec);
    }

    @Override
    public Proyectos buscarProyec(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarProyec(Long id) {
        proyectoRepo.deleteById(id);
    }
}
