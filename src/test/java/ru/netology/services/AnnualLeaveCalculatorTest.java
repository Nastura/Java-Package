package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AnnualLeaveCalculatorTest {
    // income, expenses и threshold
    @ParameterizedTest
    @CsvSource({
            "3, 10000,3000,20000",
            "2, 100_000,60_000,150_000"
    })

    public void Test1(int expected, int income, int expenses, int threshold) {
        CalculateServices services = new CalculateServices();
        int actual = services.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }


}
