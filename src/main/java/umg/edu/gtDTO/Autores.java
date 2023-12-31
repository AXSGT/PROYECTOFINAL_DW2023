package umg.edu.gtDTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author axlc1
 */


@Entity
@Table (name = "autores")

public class Autores    implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_autor")
    private Long id_autor;
    
        @Column (name = "nombre_autor")
    private String nombre_autor;
    
    public Autores(String nombre_autor){
        this.nombre_autor = nombre_autor;
    }
    
    public Autores (){
        
    }

    /**
     * @return the id_autor
     */
    public Long getId_autor() {
        return id_autor;
    }

    /**
     * @param id_autor the id_autor to set
     */
    public void setId_autor(Long id_autor) {
        this.id_autor = id_autor;
    }

    /**
     * @return the nombre_autor
     */
    public String getNombre_autor() {
        return nombre_autor;
    }

    /**
     * @param nombre_autor the nombre_autor to set
     */
    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }
    
}
