package za.ac.cput.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {
    @RequestMapping("/index")
    public String index(ModelAndView model){
        model = new ModelAndView();
        model.setViewName("templates/index.html");

        return "Hello. This is the index page.";
    }
}
