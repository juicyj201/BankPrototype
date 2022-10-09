package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Domain.Entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

@Controller
public class Login {
    @RequestMapping("/login")
    public ModelAndView login(@ModelAttribute User user){
        ModelAndView model;

        boolean name = Pattern.matches("^[a-zA-Z ]+$", user.getUsername());
        boolean pass = Pattern.matches("^[a-zA-Z0-9 ]{0,6}$", user.getPassword());

        if(user.getUsername() != null && user.getPassword() != null){
            model = new ModelAndView();
            model.setViewName("Login.html");
            model.addObject("loginmessage", "User "+user.getUsername()+", successfully logged.");
            return model;
        }
        else{
            model = new ModelAndView();
            model.setViewName("Error.html");
            model.addObject("errormessage", "an error has occurred");
            return model;
        }
    }
}
