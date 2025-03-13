package com.instana.stankv;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TemperatureTest {
    @Test
    void test_failure() {
        assertThat(true, is(false));
    }
}
