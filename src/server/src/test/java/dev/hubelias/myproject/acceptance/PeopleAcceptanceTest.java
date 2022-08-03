package dev.hubelias.myproject.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PeopleAcceptanceTest {
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
