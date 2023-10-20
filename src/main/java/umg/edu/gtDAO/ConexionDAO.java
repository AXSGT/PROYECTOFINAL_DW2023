package umg.edu.gtDAO;

import java.sql.*;

/**
 *
 * @author axlc1
 */
public class ConexionDAO {
   private String url = "jdbc:mysql://localhost:3306/dw"; //url de la bd
   private String usuario = "root";
   private String contraseña = "root";
   
   public Connection conexionMysql() throws Exception{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conexion = DriverManager.getConnection(getUrl(), getUsuario(), getContraseña());
       System.out.println("La conexion es exitosa: "+conexion);
       
       return conexion;
   }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
