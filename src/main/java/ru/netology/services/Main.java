package ru.netology.services;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Длина массива " + sales.length + " ячеек.");
        System.out.println(Arrays.toString(sales));

        System.out.println("Общая сумма продаж за все месяцы: " +service.amountOfAllSales(sales));
        System.out.println("Средняя сумма продаж в месяц: " +service.averageAmountCounter(sales));
        System.out.println("В каком по счёту месяце было максимум продаж: " +service.maxSales(sales));
        System.out.println("В каком по счёту месяце было минимум продаж: " +service.minSales(sales));
        System.out.println("Кол-во месяцев с продажами ниже средних: " +service.monthsWithSalesBelowAverage(sales));
        System.out.println("Кол-во месяцев с продажами выше средних: " +service.monthsWithSalesAboveAverage(sales));
    }
}