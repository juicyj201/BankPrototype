package za.ac.cput.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Service.Impl.AccountHolderServiceImpl;

@Controller
public class AccountController {
    // - TODO - Make sure that if the login information is passed, that the user wont be able to view any account information

    @Autowired
    private AccountHolderServiceImpl service;
    protected final static Logger logger = LoggerFactory.getLogger(AccountController.class);
    private String firstName;

    @RequestMapping("/Account/{name}")
    public ModelAndView account(@PathVariable("name") String name){
        logger.info("Entered path variable is "+name);
        AccountHolder acc = service.readByFirstName(name);

        ModelAndView model = new ModelAndView();
        model.addObject("firstName", acc.getFirstName());
        model.addObject("lastName", acc.getLastName());
        model.addObject("balance", acc.getBalance());
        model.addObject("address", acc.getAddress());
        model.addObject("email", acc.getEmail());
        model.setViewName("Account.html");
        return model;
    }
}
