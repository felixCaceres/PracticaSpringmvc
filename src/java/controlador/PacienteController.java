
package controlador;

import javax.enterprise.inject.Model;
import modelo.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;




@Controller
public class PacienteController {
  
    @RequestMapping("index")
        
        public ModelAndView redireccion(){
            
            ModelAndView mv = new ModelAndView();
            mv.setView("index");
            
                      
            return mv;
        }
        
        //Obtener todo
        
     @RequestMapping(value="getAll", method=RequestMethod.GET)
        public String getAll(Model m){
         
            Paciente model = new Paciente();
            m.addAttribute("lst", model.getListaPaciente());           
            
            return "data";
            
        }  
           
}
