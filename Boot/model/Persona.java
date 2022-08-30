
package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    
    private String email;
    
    private String sobre_mi;
    private String titulo;
    private String url_foto;
    
    public Persona(){
        
    }
    
    public Persona(long id, String nombre, String apellido, String email, String sobre_mi, String titulo, String url_foto ){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        
        this.email = email;
        
        this.sobre_mi = sobre_mi;
        this.titulo = titulo;
        this.url_foto = url_foto;
        
    }
    
    
}
