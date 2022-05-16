package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    public long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumAllSale(sales);

        assertEquals(expected, actual);


    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.average(sales);

        assertEquals(expected, actual);


    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        assertEquals(expected, actual);


    }

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        assertEquals(expected, actual);


    }

    @Test
    public void averageMinMonth() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.averageMinMonth(sales);

        assertEquals(expected, actual);


    }

    @Test
    public void averageMaxMonth() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.averageMaxMonth(sales);

        assertEquals(expected, actual);


    }
}
