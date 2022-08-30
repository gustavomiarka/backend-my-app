
package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue
    private long id;
    private String instituto;
    private String fechaIni;
    private String fechaFin;
    private String carrera;
    
    public Educacion(){
        
    }
    
    public Educacion(long id, String instituto, String fechaIni, String fechaFin, String carrera){
        this.id = id;
        this.instituto = instituto;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.carrera = carrera;
        
    }
}
