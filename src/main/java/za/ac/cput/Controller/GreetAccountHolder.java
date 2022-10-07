package za.ac.cput.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetAccountHolder {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value="accountHolder", required=true, defaultValue="Mr") String accountHolder, ModelAndView model) {
        model = new ModelAndView();
        model.addObject("accountHolder", accountHolder);
        model.setViewName("templates/hello.html");
        //model.addAttribute("accountHolder", accountHolder);

        return "hello";
    }
}
