package ru.netology;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainTest1() {
        int expected = 100;
        int actual = service.remain(900);
        ;
        assertEquals(actual, expected);
    }

    @Test
    public void remainTest2() {
        int expected = 0;
        int actual = service.remain(1000);
        ;
        assertEquals(actual, expected);
    }

    @Test
    public void remainTest3() {
        int expected = 500;
        int actual = service.remain(2500);
        ;
        assertEquals(actual, expected);
    }
}