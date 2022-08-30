
package com.ejemplo.Spring.Boot.repository;

import com.ejemplo.Spring.Boot.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    
}
