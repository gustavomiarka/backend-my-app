
package com.ejemplo.Spring.Boot.security.repository;

import com.ejemplo.Spring.Boot.security.enums.RolNombre;
import com.ejemplo.Spring.Boot.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
