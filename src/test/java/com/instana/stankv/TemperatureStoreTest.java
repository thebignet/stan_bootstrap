package com.instana.stankv;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TemperatureStoreTest {
    @Test
    void given_temperature_is_written_I_should_read_it_back() {
        var sensor = new TemperatureSensor();
        var temperatureToWrite = sensor.sense();
        TemperatureStore registry = new SimpleTemperatureStore();
        // write temperature
        // registry.xxx
        // read temperature
        var temperatureRead = 0d; // change this value to registry.yyy
        assertThat(temperatureRead, is(1d));
    }
}
