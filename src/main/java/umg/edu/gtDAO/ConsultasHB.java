package umg.edu.gtDAO;

import java.util.List;
import umg.edu.gtDTO.Autores;
//--
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import umg.edu.gtDTO.DatosDTO;

/**
 *
 * @author axlc1
 */
public class ConsultasHB {
    //******************************************autores******************************************
    
    public List<Autores> consultarAutores (){
        
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Autores.class).buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        try {
            Query query = session.createQuery("from Autores");
            
            List<Autores> autoress = query.list();
            
            session.close();
            
            return autoress;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error HB al consultar autores"+e.getStackTrace());
            return null;
        }
    }    
        
    public String crearAutores(DatosDTO autoress) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Autores.class).buildSessionFactory();
    
    Session session = sessionFactory.openSession();
    
    try {
        Autores autor = new Autores(autoress.getNombre_autor());

        session.beginTransaction();
        
        session.persist(autor);
        
        session.getTransaction().commit();
        
        session.close();
        return "AUTOR CREADO";
    } catch (Exception e) {
        e.printStackTrace();
        return "ERROR AL CREAR AL AUTOR" + e.getStackTrace();
    }
}
    
    
    
    public String modificarAutores (DatosDTO autoress){
        System.out.println("INGRESANDO AL METODO DE MODIFICAR AUTORES");
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Autores.class).buildSessionFactory();
    
        Session session = sessionFactory.openSession();
        
        Transaction transaction = null;
        try {
            
            transaction = session.beginTransaction();
            
            Autores autor = session.get(Autores.class, autoress.getId_autor());
            
            autor.setNombre_autor(autoress.getNombre_autor());
            
            session.update(autor);
            transaction.commit();
            
            return "AUTOR MODIFICACO CON EXITO";
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return "ERROR AL ACTUALIZAR EL AUTOR";
        }finally {
            session.close();
        }
        
    }
    
    public String eliminarAutores (DatosDTO autoress){
        System.out.println("INGRESANDO AL METODO DE ELIMINAR AUTORES");
        
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Autores.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = null;
        
        try {
            transaction = session.beginTransaction();
            
            //esto es para recuperar
            Autores autorEncontrado = session.get(Autores.class, autoress.getId_autor());
            
            //eliminar
            session.delete(autorEncontrado);
            
            //para confirmar
            
            transaction.commit();
            
        } catch (Exception e) {
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return "AUTOR ELIMINADO CORRECTAMENTE";
    }

    //siguen las demas tablas...
     
    }
    
    
      

