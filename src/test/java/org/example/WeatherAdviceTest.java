package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WeatherAdviceTest {

    @Test
    public void testShouldWearJacket_whenColdOutside() {
        WeatherAdvice weatherAdvice = new WeatherAdvice();
        boolean result = weatherAdvice.shouldWearJacket(-10);
        assertFalse(result, "A jacket should be worn when it is cold outside");
    }
}