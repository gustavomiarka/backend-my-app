
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.HabilidadesHard;
import java.util.List;

public interface IHabilidadesHardService {
    public List<HabilidadesHard> verHabHard();
    public void crearHabHard(HabilidadesHard hard);
    public void borrarHabHard(Long id);
    public HabilidadesHard buscarHabHard(Long id);
}
