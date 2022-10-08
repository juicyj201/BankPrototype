package za.ac.cput.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Service.Impl.AccountHolderServiceImpl;

public class AccountHolderServiceTest {
    private AccountHolderServiceImpl service;
    private AccountHolder account = new AccountHolder.AccountHolderBuilder().createAccountNumber("1234").createFullName("Johnathan", "Butler").createAddress("Washigton Square, North America").createEmail("johnB@domain.com").build();

    @Test
    public void testGeneral(){
        //Assertions.assertTrue(!account.equals(null));
    }

    @Test
    public void testSave(){
        //Assertions.assertTrue(service.save(account) != null);
    }

    @Test
    public void testRead(){
        //Assertions.assertTrue(!service.read(account.getAccountNumber()).equals(null));
    }
}
