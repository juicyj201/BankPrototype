package za.ac.cput.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Service.Impl.AccountHolderServiceImpl;

import java.util.Optional;

@Controller
@RequestMapping("/AccountHolder")
public class AccountHolderController {
    private AccountHolderServiceImpl service;
    protected final static Logger logger = LoggerFactory.getLogger(AccountHolderController.class);

    public AccountHolderController(AccountHolderServiceImpl service){
        this.service = service;
    }

    @PostMapping("/AccountHolder/save")
    public AccountHolder save(@RequestBody AccountHolder accountHolder){
        logger.info("Saving accountholder object...");
        AccountHolder returnA = service.save(accountHolder);
        if(!returnA.equals(null)) {
            logger.info("Account has been read from the database.");
        }

        return returnA;
    }

    @GetMapping("/AccountHolder/read")
    public Optional<AccountHolder> read(String accountHolder){
        logger.info("Reading accountholder object...");
        Optional<AccountHolder> returnA = service.read(accountHolder);
        if(!returnA.equals(null)) {
            logger.info("Account has been read from the database.");
        }

        return returnA;
    }
}
