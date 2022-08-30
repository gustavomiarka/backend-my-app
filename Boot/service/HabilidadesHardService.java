
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.HabilidadesHard;
import com.ejemplo.Spring.Boot.repository.HabilidadesHardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesHardService implements IHabilidadesHardService{
    
    @Autowired HabilidadesHardRepository hardRepo;
    
    @Override
    public List<HabilidadesHard> verHabHard() {
        return hardRepo.findAll();
    }

    @Override
    public void crearHabHard(HabilidadesHard per) {
        hardRepo.save(per);
    }

    @Override
    public HabilidadesHard buscarHabHard(Long id) {
        return hardRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarHabHard(Long id) {
        hardRepo.deleteById(id);
    }
    
}
