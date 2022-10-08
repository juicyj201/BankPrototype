package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Repository.AccountHolderRepository;
import za.ac.cput.Service.Impl.AccountHolderServiceImpl;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);

//        AccountHolder account = new AccountHolder.AccountHolderBuilder().createAccountNumber("1234").createFullName("Johnathan", "Butler").createAddress("Washigton Square, North America").createEmail("johnB@domain.com").build();
//        AccountHolderServiceImpl service = null;
//
//        service.save(account);
    }
}
