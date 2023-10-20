package umg.edu.gtDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import umg.edu.gtDTO.DatosDTO;

/**
 *
 * @author axlc1
 */
public class ConsultasDAO {
    ConexionDAO con = new ConexionDAO();
    
    //**************************************autores*******************************************
    public List<DatosDTO> consultarAutores () throws Exception {
        List<DatosDTO> Lista = new ArrayList<DatosDTO>();
        
        try {
            String Query = "SELECT id_autor, nombre_autor from autores";
            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(Query);
            
            while(r.next()){
                DatosDTO dato = new DatosDTO();
                dato.setId_autor(r.getLong("id_autor"));
                dato.setNombre_autor(r.getString("nombre_autor"));
                Lista.add(dato);
            }
            
        } catch (Exception e) {
            System.out.println("ERROR AL REALIZAR LA CONSULTA");
        }finally {
            if (con != null){
                try {
                    con.conexionMysql().close();
                    System.out.println("CIERRE DE LA CONEXION EXITOSA");
                } catch (Exception ex) {
                    System.out.println("ERROR AL CERRAR LA CONEXION");
                }
            }
        }
        System.out.println("EL TAMAÑO DE LA LISTA ES:"+Lista.size());
        return Lista;
    }
    
    
}
