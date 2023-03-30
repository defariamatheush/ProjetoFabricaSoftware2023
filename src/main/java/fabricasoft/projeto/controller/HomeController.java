package fabricasoft.projeto.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView index(){
        HashMap<String, String> map = new HashMap <> ();
        map.put("apelido","valor");
        map.put("nome","zezinho");
        return new ModelAndView("home/index",map);
    }
    
}
