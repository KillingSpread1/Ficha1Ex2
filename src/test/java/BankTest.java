import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void testAddAccountToClient(){
        Client client = new Client ("Diogo",26,0,10000);
        Account account = new Account(1,1000);
        assertAll(
                ()-> assertTrue(client.addAccount(account)),
                ()-> assertTrue(client.getAccounts().contains(account))
        );
    }


}