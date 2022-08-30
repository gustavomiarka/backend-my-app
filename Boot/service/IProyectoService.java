
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.Proyectos;
import java.util.List;

public interface IProyectoService {
    public List<Proyectos> verProyec();
    public void crearProyec(Proyectos proyec);
    public void borrarProyec(Long id);
    public Proyectos buscarProyec(Long id);
}
