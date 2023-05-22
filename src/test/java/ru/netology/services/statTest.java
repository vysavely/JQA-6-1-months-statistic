package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalLong;

public class statTest {

     long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

     @Test
     public void maxAmountTest() {
          StatsService service = new StatsService();

          long expectedAmount = Arrays.stream(sales).sum();
          long actualAmount = service.amountOfAllSales(sales);

          Assertions.assertEquals(expectedAmount, expectedAmount);
          System.out.println(expectedAmount + " == " + expectedAmount);
     }

     @Test
     public void averageAmountTest() {
          StatsService service = new StatsService();

          long expectedAverageAmount = Arrays.stream(sales).sum() / sales.length; //сумма всех значений массива sales делится на количество ячеек массива
          long actualAverageAmount = service.averageAmount(sales);

          Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
          System.out.println(expectedAverageAmount + " == " + actualAverageAmount);
     }

     @Test
     public void maxSalesMonthTest() {
          StatsService service = new StatsService();

          long expectedMaxSalesMonth = 0;
          long actualMaxSalesMonth = service.maxSales(sales);

          for (int i = 0; i < sales.length; i++) {
               if (sales[i] >= sales[(int) expectedMaxSalesMonth])
                    expectedMaxSalesMonth = i;
          }

          Assertions.assertEquals(expectedMaxSalesMonth + 1, actualMaxSalesMonth);
          System.out.println((expectedMaxSalesMonth + 1) + " == " + actualMaxSalesMonth);

     }

     @Test
     public void minSalesMonthTest() {
          StatsService service = new StatsService();

          //long expectedMinSalesMonth = 8;

          long expectedMinSalesMonth = 0;
          long actualMinSalesMonth = service.minSales(sales);


          for (int i = 0; i < sales.length; i++) {
               if (sales[i] <= sales[(int) expectedMinSalesMonth])
                    expectedMinSalesMonth = i;
          }

          Assertions.assertEquals(expectedMinSalesMonth + 1, actualMinSalesMonth);
          System.out.println((expectedMinSalesMonth + 1) + " == " + actualMinSalesMonth);
     }

     @Test
     public void monthsWithSalesBelowAverageTest() {
          StatsService service = new StatsService();

          long AverageAmountSales = Arrays.stream(sales).sum() / sales.length;
          long expectedBelowAverage = 0;
          long actualBelowAverage = service.monthsWithSalesBelowAverage(sales);

          for (long sale : sales) {
               if (sale < AverageAmountSales) {
                    expectedBelowAverage = expectedBelowAverage + 1;
               }
          }

          Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
          System.out.println((expectedBelowAverage) + " == " + actualBelowAverage);
     }

     @Test
     public void monthsWithSalesAboveAverageTest() {
          StatsService service = new StatsService();

          long AverageAmountSales = Arrays.stream(sales).sum() / sales.length;
          long expectedAboveAverage = 0;
          long actualAboveAverage = service.monthsWithSalesAboveAverage(sales);

          for (long sale : sales) {
               if (sale < AverageAmountSales) {
                    expectedAboveAverage = expectedAboveAverage + 1;
               }
          }

          Assertions.assertEquals(expectedAboveAverage, expectedAboveAverage);
          System.out.println((expectedAboveAverage) + " == " + expectedAboveAverage);

     }
}
