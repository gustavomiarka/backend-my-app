
package com.ejemplo.Spring.Boot.dto;

import javax.validation.constraints.NotBlank;


public class HabilidadesSoftDto {
    
    @NotBlank
    private String habilidadSoft;
    @NotBlank
    private int porcentaje;

    public HabilidadesSoftDto(String habilidadSoft, int porcentaje) {
        this.habilidadSoft = habilidadSoft;
        this.porcentaje = porcentaje;
    }

    public String getHabilidadSoft() {
        return habilidadSoft;
    }

    public void setHabilidadSoft(String habilidadSoft) {
        this.habilidadSoft = habilidadSoft;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
