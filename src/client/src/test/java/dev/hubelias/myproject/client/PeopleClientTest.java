package dev.hubelias.myproject.client;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PeopleClientTest {
    @Test
    void shouldPass() {
        assertThat(true).isTrue();
    }

    @Test
    @Disabled
    void shouldFail() {
        assertThat(false).isTrue();
    }
}
