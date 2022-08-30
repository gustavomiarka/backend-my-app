
package com.ejemplo.Spring.Boot.service;

import com.ejemplo.Spring.Boot.model.ExperienciaLab;
import com.ejemplo.Spring.Boot.repository.ExperienciaLabRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLabService implements IExperienciaLabService{
    
    @Autowired ExperienciaLabRepository expRepo;
    
    @Override
    public List<ExperienciaLab> verExp() {
        return expRepo.findAll();
    }

    @Override
    public void crearExp(ExperienciaLab exp) {
        expRepo.save(exp);
    }

    @Override
    public ExperienciaLab buscarExp(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarExp(Long id) {
        expRepo.deleteById(id);
    }
}
