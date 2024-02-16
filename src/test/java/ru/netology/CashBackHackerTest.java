package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashBackHackerTest {

    @Test
    public void testRemain ()
    {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testValueRemain ()
    {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroRemain ()
    {
        CashBackHacker service = new CashBackHacker();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

}