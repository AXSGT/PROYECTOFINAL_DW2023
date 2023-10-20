package Biblioteca8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import umg.edu.gtDAO.ConsultasHB;
import umg.edu.gtDTO.Autores;
import umg.edu.gtDTO.DatosDTO;

/**
 *
 * @author axlc1
 */


@ManagedBean(name = "bk_Inicio")
@ViewScoped
public class InicioUI implements Serializable{
    
    private String mensaje;
    
    private String dato1;
    private String dato2;
    private String dato3;
    private String dato4;
    private String dato5;
    private String dato6;
    private String dato7;
    private String dato8;
    private String dato9;
    private String dato10;
    private String dato11;
    private String dato12;
    //--------------------
    private Autores autoresss;
    private boolean band;
    private List<Autores> autores = new ArrayList<Autores>();
    
    
    @PostConstruct
    public void init (){
        
        ConsultasHB consultahb = new ConsultasHB();
        try {
            setAutores(consultahb.consultarAutores());
        } catch (Exception e) {
            System.out.println("ERROR AL INICIAR");
        }
    }
    
    //***************************************AUTORES*******************************************************************

    public void accionesAutores(int opt) throws Exception {
        
         ConsultasHB consultahb = new ConsultasHB();
         DatosDTO autores = new  DatosDTO();
         
         try {
            
             autores.setNombre_autor(dato2);
             
             switch (opt) {
                 case 1:
                     System.out.println("RESPUESTA INSERTADA AUTORES:" + consultahb.crearAutores(autores));
                     break;
                     
                 case 2:
                     autores.setId_autor(Long.parseLong(dato1));
                     System.out.println("RESPUESTA ACTUALIZACION DE AUTORES: " + consultahb.modificarAutores(autores));
                     break;
                     
                 case 3:
                     autores.setId_autor(Long.parseLong(dato1));
                     System.out.println("RESPUESTA ACTUALIZACION DE AUTORES: " + consultahb.eliminarAutores(autores));
                     break;
             }
             
             setAutores(consultahb.consultarAutores());
             
             dato1="";
             dato2="";
             band = false;
        } catch (Exception ex) {
             System.out.println("ERROR  DE LA ACCION DE AUTORES" + ex);
        }
    }
    
    public void autorseleccionado (SelectEvent event){
        autoresss = (Autores) event.getObject();
        
        //datos del autor
        dato1= Long.toString(getAutoresss().getId_autor());
        dato2= autoresss.getNombre_autor();
        
        band = true;
    }
    
    public void onRowUnSelect (UnselectEvent event) {
        dato1 = "";
        dato2 = "";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the dato1
     */
    public String getDato1() {
        return dato1;
    }

    /**
     * @param dato1 the dato1 to set
     */
    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    /**
     * @return the dato2
     */
    public String getDato2() {
        return dato2;
    }

    /**
     * @param dato2 the dato2 to set
     */
    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    /**
     * @return the dato3
     */
    public String getDato3() {
        return dato3;
    }

    /**
     * @param dato3 the dato3 to set
     */
    public void setDato3(String dato3) {
        this.dato3 = dato3;
    }

    /**
     * @return the dato4
     */
    public String getDato4() {
        return dato4;
    }

    /**
     * @param dato4 the dato4 to set
     */
    public void setDato4(String dato4) {
        this.dato4 = dato4;
    }

    /**
     * @return the dato5
     */
    public String getDato5() {
        return dato5;
    }

    /**
     * @param dato5 the dato5 to set
     */
    public void setDato5(String dato5) {
        this.dato5 = dato5;
    }

    /**
     * @return the dato6
     */
    public String getDato6() {
        return dato6;
    }

    /**
     * @param dato6 the dato6 to set
     */
    public void setDato6(String dato6) {
        this.dato6 = dato6;
    }

    /**
     * @return the dato7
     */
    public String getDato7() {
        return dato7;
    }

    /**
     * @param dato7 the dato7 to set
     */
    public void setDato7(String dato7) {
        this.dato7 = dato7;
    }

    /**
     * @return the dato8
     */
    public String getDato8() {
        return dato8;
    }

    /**
     * @param dato8 the dato8 to set
     */
    public void setDato8(String dato8) {
        this.dato8 = dato8;
    }

    /**
     * @return the dato9
     */
    public String getDato9() {
        return dato9;
    }

    /**
     * @param dato9 the dato9 to set
     */
    public void setDato9(String dato9) {
        this.dato9 = dato9;
    }

    /**
     * @return the dato10
     */
    public String getDato10() {
        return dato10;
    }

    /**
     * @param dato10 the dato10 to set
     */
    public void setDato10(String dato10) {
        this.dato10 = dato10;
    }

    /**
     * @return the dato11
     */
    public String getDato11() {
        return dato11;
    }

    /**
     * @param dato11 the dato11 to set
     */
    public void setDato11(String dato11) {
        this.dato11 = dato11;
    }

    /**
     * @return the dato12
     */
    public String getDato12() {
        return dato12;
    }

    /**
     * @param dato12 the dato12 to set
     */
    public void setDato12(String dato12) {
        this.dato12 = dato12;
    }

    /**
     * @return the band
     */
    public boolean isBand() {
        return band;
    }

    /**
     * @param band the band to set
     */
    public void setBand(boolean band) {
        this.band = band;
    }

    /**
     * @return the autores
     */
    public List<Autores> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(List<Autores> autores) {
        this.autores = autores;
    }

    /**
     * @return the autoresss
     */
    public Autores getAutoresss() {
        return autoresss;
    }

    /**
     * @param autoresss the autoresss to set
     */
    public void setAutoresss(Autores autoresss) {
        this.autoresss = autoresss;
    }
    
    
    
}
