
package modelo;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class Paciente {
    //aqui se crea el CRUD
    public List<Paciente> getListaPaciente(){
        
        List<Paciente> lista = new ArrayList<Paciente>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            lista = s.createCriteria(Paciente.class).list();
            s.getTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        return lista;
    }
    
    //Falta crear 
    //Remove
    //Update
    //View
}
