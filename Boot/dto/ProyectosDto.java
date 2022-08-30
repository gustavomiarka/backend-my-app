
package com.ejemplo.Spring.Boot.dto;

import javax.validation.constraints.NotBlank;


public class ProyectosDto {
    
    @NotBlank
    private String titulo;
    @NotBlank
    private String fechaIni;
    @NotBlank
    private String fechaFin;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String link;

    public ProyectosDto(String titulo, String fechaIni, String fechaFin, String descripcion, String link) {
        this.titulo = titulo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getLink() {
        return descripcion;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
