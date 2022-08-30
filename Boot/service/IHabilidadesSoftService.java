
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.HabilidadesSoft;
import java.util.List;

public interface IHabilidadesSoftService {
    public List<HabilidadesSoft> verHabSoft();
    public void crearHabSoft(HabilidadesSoft soft);
    public void borrarHabSoft(Long id);
    public HabilidadesSoft buscarHabSoft(Long id);
}
