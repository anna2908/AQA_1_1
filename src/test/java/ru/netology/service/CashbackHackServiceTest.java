package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cash.remain(amount);
        assertEquals(actual, expected);

        amount = 1000;
        expected = 0;
        actual = cash.remain(amount);
        assertEquals(actual, expected);

        amount = 1001;
        expected = 999;
        actual = cash.remain(amount);
        assertEquals(actual, expected);
    }
}