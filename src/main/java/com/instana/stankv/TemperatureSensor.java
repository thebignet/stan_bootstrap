package com.instana.stankv;

import java.util.Random;

public class TemperatureSensor {

    public double sense(){
        return new Random().nextDouble() * 100;
    }
}