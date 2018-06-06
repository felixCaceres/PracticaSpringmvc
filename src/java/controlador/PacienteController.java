
package controlador;


import modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;




@Controller
@Transactional
public class PacienteController {
    
    @Autowired
    Paciente model;
  
    @RequestMapping("index")
        
        public ModelAndView redireccion(){
            
            ModelAndView mv = new ModelAndView();
            mv.setView("index");
            
                      
            return mv;
        }
        
        //Obtener todo
        
     @RequestMapping(value="getAll", method=RequestMethod.GET)
        public String getAll(Model m){
         
            
            m.addAttribute("lst", model.getListaPaciente());           
            
            return "data";
            
        }  
        
     @RequestMapping(value="salvar", method=RequestMethod.GET)
        public String saveOne(Model m){
         
            pojo.Paciente p = new pojo.Paciente();
            p.setNombre("Spring");
            p.setApellido("SpringSave");
            model.save(p);           
            
            return "data";
            
        }  
           
}
