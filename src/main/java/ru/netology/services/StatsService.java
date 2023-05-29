package ru.netology.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с макс продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) { //цикл крутит счётчик с 0 до 12 (sales.length), за одну итерацию добавляя по 1 к i
            if (sales[i] >= sales[maxMonth]) { // при этом из массива sales берётся значения в ячейке с номером, определяемым текущим значением i (не забывай что это значение увеличивается за счёт цикла, соотв. в каждую новую итерацию это будет "следующая" ячейка в массиве sales) и сверяется (больше ири равно) со значением maxMonths.
                maxMonth = i; // если значение Sales[i] больше, а в случае первого цикла, где maxMonths = 0, оно точно больше, maxMonth приобретает номер ячейки из массива sales, и так далее, пока не завершится цикл, в итоге в переменной maxMonths должен остаться номер ячейки с максимальным значением из массива Sales.
            }
        }
        return maxMonth + 1; //т.к. нумерация ячеек идёт с 0, то плюсуем +1, чтобы значение соответствовало кол-ву месяцев в календарном году.
    }

    public long amountOfAllSales(long[] sales) {
        long allSalesSum = 0; // переменная для хранения всей суммы продаж за все месяцы

        for (long sale : sales) {  //данный цикл перебирает все данные в массиве и поочерёдно выдаёт их в переменную sale
            allSalesSum += sale;
        }
        return allSalesSum;
    }

    public long averageAmountCounter(long[] sales) {
        return amountOfAllSales(sales) / sales.length; //сумма всех продаж делится на количество месяцев в году (кол-во ячеек в цикле).
    }

    public long monthsWithSalesBelowAverage(long[] sales) {
        long monthBelowAverage = 0;
        long averageAmount = averageAmountCounter(sales);
        for (long sale : sales) {
            if (sale < averageAmount) { //здесь значения ячеек из массива sales сравниваются со значениями, возвращаемыми методом averageAmount при обработке массива sales
                monthBelowAverage = monthBelowAverage + 1;
            }
        }
        return monthBelowAverage;
    }

    public long monthsWithSalesAboveAverage(long[] sales) {
        long monthAboveAverage = 0;
        long averageAmount = averageAmountCounter(sales);
        for (long sale : sales) {
            if (sale > averageAmount) { //здесь значения ячеек из массива sales сравниваются со значениями, возвращаемыми методом averageAmount при обработке массива sales
                monthAboveAverage = monthAboveAverage + 1;
            }
        }
        return monthAboveAverage;
    }
}