
package com.ejemplo.Spring.Boot.dto;

import javax.validation.constraints.NotBlank;


public class HabilidadesHardDto {
    
    @NotBlank
    private String habilidadHard;
    @NotBlank
    private int porcentaje;

    public HabilidadesHardDto(String habilidadHard, int porcentaje) {
        this.habilidadHard = habilidadHard;
        this.porcentaje = porcentaje;
    }

    public String getHabilidadHard() {
        return habilidadHard;
    }

    public void setHabilidadHard(String habilidadHard) {
        this.habilidadHard = habilidadHard;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
