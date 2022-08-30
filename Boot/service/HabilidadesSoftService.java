
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.HabilidadesSoft;
import com.ejemplo.Spring.Boot.repository.HabilidadesSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class HabilidadesSoftService implements IHabilidadesSoftService{
    
    @Autowired HabilidadesSoftRepository softRepo;
    
    @Override
    public List<HabilidadesSoft> verHabSoft() {
        return softRepo.findAll();
    }

    @Override
    public void crearHabSoft(HabilidadesSoft soft) {
        softRepo.save(soft);
    }

    @Override
    public HabilidadesSoft buscarHabSoft(Long id) {
        return softRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarHabSoft(Long id) {
        softRepo.deleteById(id);
    }
}
