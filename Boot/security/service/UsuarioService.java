
package com.ejemplo.Spring.Boot.security.service;

import com.ejemplo.Spring.Boot.security.model.Usuario;
import com.ejemplo.Spring.Boot.security.repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository userRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return userRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return userRepo.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return userRepo.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        userRepo.save(usuario);
    }
}
