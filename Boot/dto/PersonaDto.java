
package com.ejemplo.Spring.Boot.dto;

import javax.validation.constraints.NotBlank;


public class PersonaDto {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    
    @NotBlank
    private String email;
    
    @NotBlank
    private String sobre_mi;
    @NotBlank
    private String titulo;
    @NotBlank
    private String url_foto;

    public PersonaDto(String nombre, String apellido, String email, String sobre_mi, String titulo, String url_foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        this.email = email;
        
        this.sobre_mi = sobre_mi;
        this.titulo = titulo;
        this.url_foto = url_foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getSobre_mi() {
        return sobre_mi;
    }

    public void setSobre_mi(String sobre_mi) {
        this.sobre_mi = sobre_mi;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }
    
    
}
