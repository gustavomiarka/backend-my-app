
package com.ejemplo.Spring.Boot.security.service;

import com.ejemplo.Spring.Boot.security.model.Usuario;
import com.ejemplo.Spring.Boot.security.model.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService userSer;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = userSer.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
    
}
