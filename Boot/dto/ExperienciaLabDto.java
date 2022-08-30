
package com.ejemplo.Spring.Boot.dto;

import javax.validation.constraints.NotBlank;


public class ExperienciaLabDto {
    
    @NotBlank
    private String nombreEmpresa;
    @NotBlank
    private String fechaIni;
    @NotBlank
    private String fechaFin;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String titulo;

    public ExperienciaLabDto(String nombreEmpresa, String fechaIni, String fechaFin, String descripcion, String titulo) {
        this.nombreEmpresa = nombreEmpresa;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
