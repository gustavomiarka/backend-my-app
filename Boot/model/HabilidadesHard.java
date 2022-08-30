
package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HabilidadesHard {
    
    @Id
    @GeneratedValue
    private long id;
    private String habilidadHard;
    private int porcentaje;
    
    public HabilidadesHard(){
        
    }
    
    public HabilidadesHard(long id, String habilidadHard, int porcentaje){
        this.id = id;
        this.habilidadHard = habilidadHard;
        this.porcentaje = porcentaje;
        
    }
}
