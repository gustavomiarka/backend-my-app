
package com.ejemplo.Spring.Boot.repository;

import com.ejemplo.Spring.Boot.model.HabilidadesHard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesHardRepository extends JpaRepository<HabilidadesHard, Long>{
    
}
