package za.ac.cput.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Domain.Entity.User;
import za.ac.cput.Service.Impl.AccountHolderServiceImpl;
import za.ac.cput.Service.Impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

@Controller
public class Login {
    //TODO - add a sign up page that will save the user data automatically

    @Autowired
    private UserServiceImpl service;
    protected final static Logger logger = LoggerFactory.getLogger(Login.class);

    @RequestMapping("/login")
    public ModelAndView login(@ModelAttribute User user){
        ModelAndView model;

//        boolean name = Pattern.matches("^([a-zA-Z ]+)$", user.getUsername());
//        boolean pass = Pattern.matches("^([a-zA-Z0-9 ]{0,6})$", user.getPassword());
//
//        if(name != false && pass != false){
        if(!service.read(user.getUsername()).equals(null)){
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

//    @PostMapping("/login")
//    public ResponseEntity<User> saveUser(@ModelAttribute User user){
//        logger.info("Saving user information...");
//        User returnU = service.save(user);
//        if(!returnU.equals(null)) {
//            logger.info("User has been saved to the database.");
//        }else{
//            logger.error("An error has occurred.");
//        }
//
//        return new ResponseEntity<User>(returnU, HttpStatus.OK);
//    }
}
