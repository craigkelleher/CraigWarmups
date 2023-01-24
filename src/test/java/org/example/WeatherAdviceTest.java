package org.example;

import org.junit.jupiter.api.Test;

public class WeatherAdviceTest {

    @Test
    public void testShouldWearJacket_whenColdOutside() {
        WeatherAdvice weatherAdvice = new WeatherAdvice();
        boolean result = weatherAdvice.shouldWearJacket(-10);
        assertFalse("A jacket should be worn when it is cold outside", result);
    }
}