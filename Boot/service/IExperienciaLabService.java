
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.ExperienciaLab;
import java.util.List;

public interface IExperienciaLabService {
    public List<ExperienciaLab> verExp();
    public void crearExp(ExperienciaLab exp);
    public void borrarExp(Long id);
    public ExperienciaLab buscarExp(Long id);
}
