package ru.netology.javaqa.MassiveHomework.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatSalesTest {

    @Test
    public void TotalNumberOfSales() {

        StatSales service = new StatSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.allSales(sales);

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AverageNumberOfSales() {

        StatSales service = new StatSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSales(sales);

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MonthMaximumSale() {

        StatSales service = new StatSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxMonthSale(sales);

        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void MonthMinimumSale() {

        StatSales service = new StatSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minMonthSale(sales);

        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void BellowSalesMonth() {

        StatSales service = new StatSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.bellowAverageSale(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AboveSalesMonth() {

        StatSales service = new StatSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveAverageSale(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }


}