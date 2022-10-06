package za.ac.cput.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Service.Impl.AccountHolderServiceImpl;

@RestController
public class AccountHolderController {
    private AccountHolderServiceImpl service;

    public AccountHolderController(AccountHolderServiceImpl service){
        this.service = service;
    }

    @PostMapping
    public AccountHolder save(AccountHolder accountHolder){
        return service.save(accountHolder);
    }
}
