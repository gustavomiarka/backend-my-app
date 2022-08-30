
package com.ejemplo.Spring.Boot.repository;

import com.ejemplo.Spring.Boot.model.ExperienciaLab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLabRepository extends JpaRepository<ExperienciaLab, Long> {
    
}
