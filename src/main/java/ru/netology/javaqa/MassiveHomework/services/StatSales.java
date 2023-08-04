package ru.netology.javaqa.MassiveHomework.services;

public class StatSales {

    public long allSales(long[] sales) { // сумма всех продаж
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;

    }

    public long averageSales(long[] sales) { // средняя сумма продаж в месяц
        long average = allSales(sales) / sales.length;
        return average;

    }

    public int maxMonthSale(long[] sales) { // номер месяца продаж на максимумльную сумму
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }

        }
        return max + 1;
    }

    public int minMonthSale(long[] sales) { // номер месяца продаж на минимальную сумму
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int bellowAverageSale(long[] sales) { // кол-во месяцев продаж ниже среднего
        int count = 0;
        long avgSale = averageSales(sales);
        for (long sale : sales) {
            if (sale < avgSale) {
                count++;
            }

        }

        return count;
    }

    public int aboveAverageSale(long[] sales) { // кол-во месяцев продаж выше среднего
        int count = 0;
        long avgSale = averageSales(sales);
        for (long sale : sales) {
            if (sale > avgSale) {
                count++;
            }

        }
        return count;
    }
}
