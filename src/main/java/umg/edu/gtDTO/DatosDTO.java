package umg.edu.gtDTO;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author axlc1
 */
public class DatosDTO implements Serializable{
    //para autores
    private Long id_autor;
    private String nombre_autor;
    
    //para cuentas bibliotecarias
    private Long id_cuenta;
    private Long id_estudiante;
    
    //para estudiantes
   private String nombre;
   private String apellido;
   private Date fecha_nacimiento;
   private String direccion;
   private String telefono;
   
   //para libros
   private Long id_libro;
   private String titulo;
   private Long id_tipo_libro;
   private Date anio_publicacion;
   private Long cantidad_disponible;
   
   //para prestamos
   private Long id_prestamo;
   //se usa la de id_estudiante;
   //se usa la de id_libro;
   private Date fecha_prestamo;
   private Date fecha_devolucion;
   
   
   //para tipos de libros
   //**private Long id_tipo_libro; se usa la de libros
   private String nombre_tipo_libro;

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

    /**
     * @return the id_cuenta
     */
    public Long getId_cuenta() {
        return id_cuenta;
    }

    /**
     * @param id_cuenta the id_cuenta to set
     */
    public void setId_cuenta(Long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    /**
     * @return the id_estudiante
     */
    public Long getId_estudiante() {
        return id_estudiante;
    }

    /**
     * @param id_estudiante the id_estudiante to set
     */
    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fecha_nacimiento
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the id_libro
     */
    public Long getId_libro() {
        return id_libro;
    }

    /**
     * @param id_libro the id_libro to set
     */
    public void setId_libro(Long id_libro) {
        this.id_libro = id_libro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the id_tipo_libro
     */
    public Long getId_tipo_libro() {
        return id_tipo_libro;
    }

    /**
     * @param id_tipo_libro the id_tipo_libro to set
     */
    public void setId_tipo_libro(Long id_tipo_libro) {
        this.id_tipo_libro = id_tipo_libro;
    }

    /**
     * @return the anio_publicacion
     */
    public Date getAnio_publicacion() {
        return anio_publicacion;
    }

    /**
     * @param anio_publicacion the anio_publicacion to set
     */
    public void setAnio_publicacion(Date anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    /**
     * @return the cantidad_disponible
     */
    public Long getCantidad_disponible() {
        return cantidad_disponible;
    }

    /**
     * @param cantidad_disponible the cantidad_disponible to set
     */
    public void setCantidad_disponible(Long cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    /**
     * @return the id_prestamo
     */
    public Long getId_prestamo() {
        return id_prestamo;
    }

    /**
     * @param id_prestamo the id_prestamo to set
     */
    public void setId_prestamo(Long id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    /**
     * @return the fecha_prestamo
     */
    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    /**
     * @param fecha_prestamo the fecha_prestamo to set
     */
    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    /**
     * @return the fecha_devolucion
     */
    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    /**
     * @param fecha_devolucion the fecha_devolucion to set
     */
    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    /**
     * @return the nombre_tipo_libro
     */
    public String getNombre_tipo_libro() {
        return nombre_tipo_libro;
    }

    /**
     * @param nombre_tipo_libro the nombre_tipo_libro to set
     */
    public void setNombre_tipo_libro(String nombre_tipo_libro) {
        this.nombre_tipo_libro = nombre_tipo_libro;
    }
   
   
    
    
}
