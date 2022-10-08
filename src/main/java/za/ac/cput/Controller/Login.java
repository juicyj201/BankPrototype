package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

@Controller
public class Login {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, ModelAndView model){
        String name = request.getParameter("username");
        String pass = request.getParameter("password");

        boolean nametrue = Pattern.matches("^[a-zA-Z ]+$", name);
        boolean passtrue = Pattern.matches("^[a-zA-Z0-9 ]{0,6}$", pass);

        if(!name.equals(null) && !pass.equals(null)){
            model = new ModelAndView();
            model.setViewName("templates/Login.html");
            model.addObject("loginmessage", "account holder"+name+", successfully logged.");
        }
        else{
            model = new ModelAndView();
            model.setViewName("templates/Error.html");
            model.addObject("errormessage", "an error has occurred");
        }

        return "login";
    }
}
