package za.ac.cput.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Domain.Entity.User;

@Controller
public class Index {
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        model.addObject("user", new User());
        model.setViewName("index.html");

        return model;
    }


}
