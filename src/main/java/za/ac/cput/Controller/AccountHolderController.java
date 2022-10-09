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

import java.util.List;
import java.util.Optional;

@RestController
public class AccountHolderController {
    @Autowired
    private AccountHolderServiceImpl service;
    protected final static Logger logger = LoggerFactory.getLogger(AccountHolderController.class);

    @PostMapping("/AccountHolder")
    public ResponseEntity<AccountHolder> save(@RequestBody AccountHolder accountHolder){
        logger.info("Saving accountholder object...");
        AccountHolder returnA = service.save(accountHolder);
        if(!returnA.equals(null)) {
            logger.info("Account has been read from the database.");
        }else{
            logger.error("An error has occurred.");
        }

        return new ResponseEntity<AccountHolder>(returnA, HttpStatus.OK);
    }

    @GetMapping("/AccountHolder/{accountNumber}")
    public ResponseEntity<Optional<AccountHolder>> read(@PathVariable String accountNumber){
        logger.info("Reading accountholder object...");
        Optional<AccountHolder> returnA = service.read(accountNumber);
        if(!returnA.equals(null)) {
            logger.info("Account has been read from the database.");
        }else{
            logger.error("An error has occurred.");
        }

        return new ResponseEntity<Optional<AccountHolder>>(returnA, HttpStatus.OK);
    }

    @GetMapping("/AccountHolder")
    public ResponseEntity<List<AccountHolder>> readAll(){
        logger.info("Reading accountholder objects list...");
        List<AccountHolder> returnAList = (List<AccountHolder>) service.readAll();
        if(!returnAList.isEmpty()) {
            logger.info("Account has been read from the database.");
        }else{
            logger.error("An error has occurred.");
        }

        return new ResponseEntity<List<AccountHolder>>(returnAList, HttpStatus.OK);
    }

    @PutMapping("/AccountHolder")
    public ResponseEntity<AccountHolder> update(@RequestBody AccountHolder accountHolder){
        logger.info("Updating accountholder object...");
        AccountHolder returnA = service.update(accountHolder);
        if(!returnA.equals(null)) {
            logger.info("Account has been updated in the database.");
        }else{
            logger.error("An error has occurred.");
        }

        return new ResponseEntity<AccountHolder>(returnA, HttpStatus.OK);
    }
}
