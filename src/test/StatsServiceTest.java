package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void findSumOfPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findSum(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void findAverageSumOfPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findAverage(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMaxPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMinPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthUnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findUnderAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthOverAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findOverAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
}