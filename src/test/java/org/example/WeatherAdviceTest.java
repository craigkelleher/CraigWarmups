package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherAdviceTest {

    @Test
    public void testShouldWearJacket_whenColdOutside() {
        WeatherAdvice weatherAdvice = new WeatherAdvice();
        assertTrue(weatherAdvice.shouldWearJacket(-10.0));
    }
}