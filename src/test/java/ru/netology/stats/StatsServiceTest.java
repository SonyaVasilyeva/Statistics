package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesAmount () {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18} ;

        int expected = 180;
        int actual = service.yearSalesAmountService(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount () {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18} ;

        int expected = 15;
        int actual = service.averageAmountService(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMaxSales () {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18} ;

        int expected = 8;
        int actual = service.maxSalesMonthService(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMinSales () {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18} ;

        int expected = 9;
        int actual = service.minSalesMonthService(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountOfMonthsWithLessAverageSales () {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18} ;

        int expected = 5;
        int actual = service.getAmountOfMonthsWithLessAverageSalesService(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountOfMonthsWithMoreAverageSales () {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18} ;

        int expected = 5;
        int actual = service.getAmountOfMonthsWithMoreAverageSalesService(sum);
        Assertions.assertEquals(expected, actual);
    }
}

