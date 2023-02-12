package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cash.remain(amount);
        assertEquals(expected, actual);

        amount = 1000;
        expected = 0;
        actual = cash.remain(amount);
        assertEquals(expected, actual);

        amount = 1001;
        expected = 999;
        actual = cash.remain(amount);
        assertEquals(expected, actual);
    }
}