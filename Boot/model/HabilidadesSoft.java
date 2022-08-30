
package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HabilidadesSoft {
    
    @Id
    @GeneratedValue
    private long id;
    private String habilidadSoft;
    private int porcentaje;
    
    public HabilidadesSoft(){
        
    }
    
    public HabilidadesSoft(long id, String habilidadSoft, int porcentaje){
        this.id = id;
        this.habilidadSoft = habilidadSoft;
        this.porcentaje = porcentaje;
        
    }
}
