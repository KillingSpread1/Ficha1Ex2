import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void testAddAccountToClient(){
        Client client = new Client ("Diogo",26,0,10000);
        Account account = new Account(1,1000);
        Account account2 = new Account (2, 1500);
        assertAll(
                ()-> assertTrue(client.addAccount(account, account2)),
                ()-> assertTrue(client.getAccounts().contains(account)),
                ()-> assertTrue(client.getAccounts().contains(account2)),
                ()-> assertEquals(2,client.getAccounts().size()),
                ()-> assertThrows(ArrayStoreException.class, ()->client.addAccount(account)) //Garante que lança a exceção
        );
    }

}