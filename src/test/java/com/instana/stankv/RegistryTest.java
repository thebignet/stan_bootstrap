package com.instana.stankv;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class RegistryTest {
    @Test
    void test_failure() {
        assertThat(true, is(false));
    }
}
