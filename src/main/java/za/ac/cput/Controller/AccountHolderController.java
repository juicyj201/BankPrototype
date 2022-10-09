package za.ac.cput.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Service.Impl.AccountHolderServiceImpl;
import java.util.Optional;

@RestController
@RequestMapping("/AccountHolder/")
public class AccountHolderController {
    private AccountHolderServiceImpl service;
    protected final static Logger logger = LoggerFactory.getLogger(AccountHolderController.class);

    @Autowired
    public AccountHolderController(AccountHolderServiceImpl service){
        this.service = service;
    }

    @PostMapping("/AccountHolder/save")
    public ResponseEntity<AccountHolder> save(@RequestBody AccountHolder accountHolder){
        logger.info("Saving accountholder object...");
        AccountHolder returnA = service.save(accountHolder);
        if(!returnA.equals(null)) {
            logger.info("Account has been read from the database.");
        }

        return new ResponseEntity<AccountHolder>(returnA, HttpStatus.OK);
    }

    @GetMapping("AccountHolder/read/{accountNumber}")
    public ResponseEntity<Optional<AccountHolder>> read(@PathVariable String accountNumber){
        logger.info("Reading accountholder object...");
        Optional<AccountHolder> returnA = service.read(accountNumber);
        if(!returnA.equals(null)) {
            logger.info("Account has been read from the database.");
        }

        return new ResponseEntity<Optional<AccountHolder>>(returnA, HttpStatus.OK);
    }
}
