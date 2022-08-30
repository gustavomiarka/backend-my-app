
package com.ejemplo.Spring.Boot.repository;

import com.ejemplo.Spring.Boot.model.HabilidadesSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesSoftRepository extends JpaRepository<HabilidadesSoft, Long>{
    
}
