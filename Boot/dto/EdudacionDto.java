
package com.ejemplo.Spring.Boot.dto;

import javax.validation.constraints.NotBlank;


public class EdudacionDto {
    
    @NotBlank
    private String instituto;
    @NotBlank
    private String fechaIni;
    @NotBlank
    private String fechaFin;
    @NotBlank
    private String carrera;
    
    public EdudacionDto(String instituto, String fechaIni, String fechaFin, String carrera) {
        this.instituto = instituto;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.carrera = carrera;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
}
