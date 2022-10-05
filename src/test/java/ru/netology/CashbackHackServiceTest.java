package ru.netology;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void remain1() {
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected,actual);
    }

    @Test
    public void remain2() {
        int expected = 0;
        int actual = service.remain(10000);
        assertEquals(expected,actual);
    }

    @Test
    public void remain3() {
        int expected = 700;
        int actual = service.remain(1300);
        assertEquals(expected,actual);
    }
}