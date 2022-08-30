
package com.ejemplo.Spring.Boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue
    private long id;
    private String titulo;
    private String fechaIni;
    private String fechaFin;
    private String descripcion;
    private String link;
    
    public Proyectos(){
        
    }
    
    public Proyectos(long id, String titulo, String fechaIni, String fechaFin, String descripcion, String link){
        this.id = id;
        this.titulo = titulo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.link = link;
        
    }
}
