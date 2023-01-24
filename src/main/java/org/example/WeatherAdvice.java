package org.example;

public class WeatherAdvice {
    public boolean shouldWearJacket(double temperature) {
        if (temperature < 32.0){
            return true;
        }
        return false;
    }
}
