import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class Seed {



    @Test
    public void test0() throws Throwable {
        BankAccount bankAccount0 = new BankAccount("User", 100.0);
        bankAccount0.unlock("1999");
        boolean result = bankAccount0.withdraw(10);
        assertTrue(result);
    }
}

