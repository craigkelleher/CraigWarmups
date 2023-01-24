package org.example;

public class WeatherAdvice {
    public boolean shouldWearJacket(double temperature) {
        if (temperature < 32){
            return true;
        }
        return false;
    }
}
