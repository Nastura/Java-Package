package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class AnnualLeaveCalculatorTest {
    // income, expenses и threshold
    @ParameterizedTest
    @CsvFileSource(files = "src/main/resources/CsvResurces.csv")

    public void Test1(int expected, int income, int expenses, int threshold) {
        CalculateServices services = new CalculateServices();
        int actual = services.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
