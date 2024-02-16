package ru.netology;
import static org.testng.Assert.assertEquals;
public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void testRemain ()
    {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void testreminWitchCashback ()
    {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testremiZero ()
    {
        CashBackHacker service = new CashBackHacker();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

}
