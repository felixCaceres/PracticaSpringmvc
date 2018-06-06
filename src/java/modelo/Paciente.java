
package modelo;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pojo.Seguimiento;

@Repository
@Transactional
public class Paciente {
    //aqui se crea el CRUD
    @Autowired 
    private SessionFactory sessionFactory;

    
    
    
    
    
    public List<pojo.Paciente> getListaPaciente(){
        
        List<pojo.Paciente> lista = new ArrayList<>();
                
        Session s;
        try {
            s = sessionFactory.getCurrentSession();
            
            lista = s.createCriteria(pojo.Paciente.class).list();
            for(pojo.Paciente p: lista) {
                System.out.println("lista pacientes: "+p.getNombre());
            
            }
        } 
        catch (HibernateException he) {
             System.out.println("se produjo una excepcion "+he.toString());
        }
        
        
        
        
        return lista;
    }
    
    public void save(pojo.Paciente p ){
         Session s;
        try {
            s = sessionFactory.getCurrentSession();
            
             s.persist(p);
            System.out.println("guardado");
        } 
        catch (HibernateException he) {
             System.out.println("se produjo una excepcion "+he.toString());
        }
    }
    
    //Falta crear 
    //Remove
    //Update
    //View
}
