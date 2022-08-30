
package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLab {
    
    @Id
    @GeneratedValue
    private long id;
    private String nombreEmpresa;
    private String fechaIni;
    private String fechaFin;
    private String descripcion;
    private String titulo;
    
    public ExperienciaLab(){
        
    }
    
    public ExperienciaLab(String nombreEmpresa, String fechaIni, String fechaFin, String descripcion, String titulo){
        
        this.nombreEmpresa = nombreEmpresa;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.titulo = titulo; 
        
    }

    
   
    
    
}

