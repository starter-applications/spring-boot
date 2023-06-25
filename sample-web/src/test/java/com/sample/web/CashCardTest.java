package com.sample.web;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CashCardTest {
    @Test
    public void myFirstTest() {
        CashCard cashCard = new CashCard(99L, 123.45);
        assertThat(cashCard.id()).isEqualTo(99L);
        assertThat(cashCard.amount()).isEqualTo(123.45);
    }
}