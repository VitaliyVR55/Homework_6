package ru.netologi.stats;

public class StatsService {

    public int sumSales(int[] sales) {    // вводные данны на сумму продаж
        int sum = 0;              // создаем переменну сумма
        for (int i = 0; i < sales.length; i++) {  // нахождение суммы
            sum = sum + sales[i];
        }
        return sum;
    }

    public int aversum(int[] sales) {          // нахождение среднего значения
        int sum = 0;
        sum = sumSales (sales);
        return sum / 12;

    }

    public int maxmonth(int[] sales) {           // нахождение месяца пика продаж
        int maxsummonth = 0;
        int maxmonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (maxsummonth <= sales[i]) {
                maxsummonth = sales[i];
                maxmonth = i + 1;
            }
        }
        return maxmonth;
    }

    public int minmonth(int[] sales) {            //  Нахождения месяца мин-м продаж
        int minsummonth = sales[0];
        int minmonth = 0;
        for (int i = 0; i < sales.length; i++){
            if (minsummonth >= sales[i]) {
                minsummonth = sales[i];
                minmonth = i + 1;
            }
        }
        return minmonth;
    }

    public int minBelAver(int[] sales) {   // Месяцы с продажами ниже среднего
        int minBelAver = 0;
        int aversum = 0;
        aversum = aversum(sales);
        for ( int i = 0; i < sales.length; i++) {
            if (sales[i] < aversum) {
                minBelAver = minBelAver + 1;
            }
        }
        return minBelAver;
    }

    public int maxBelAver (int[] sales) {       // Месяцы с продажами выше среднего
        int maxBelAver = 0;
        int aversum = 0;
        aversum = aversum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > aversum) {
                maxBelAver = maxBelAver + 1;
            }
        }
        return maxBelAver;
    }

}
