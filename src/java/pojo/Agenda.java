package pojo;
// Generated 30/05/2018 11:24:50 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Agenda generated by hbm2java
 */
public class Agenda  implements java.io.Serializable {


     private Integer id;
     private String evento;
     private Date fecha;
     private Date hora;

    public Agenda() {
    }

    public Agenda(String evento, Date fecha, Date hora) {
       this.evento = evento;
       this.fecha = fecha;
       this.hora = hora;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEvento() {
        return this.evento;
    }
    
    public void setEvento(String evento) {
        this.evento = evento;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }




}


