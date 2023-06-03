
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netologi.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;                                  // сумма продаж
        int actual = service.sumSales (sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;                                   // Среднее значение продаж
        int actual = service.aversum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;                                   // Месяц мах продаж
        int actual = service.maxmonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;                                   // Месяц мин продаж
        int actual = service.minmonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinBelAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;                                   // Количество месяцев ниже среднего
        int actual = service.minBelAver(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxBelAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;                                   // количество месяцев выше среднего
        int actual = service.maxBelAver(sales);

        Assertions.assertEquals(expected, actual);
    }
}
