package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTestSuite {

    @Test
    public void shouldReturnSum() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.sum(a:20, b:10);
        //then
        Assertions.assertEquals(expected:30, result);
    }

    @Test
    public void shouldReturnSub() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.sub(a:20, b:10);
        //then
        Assertions.assertEquals(expected:10, result);
    }
        @Test
        public void shouldReturnPowGreaterThanZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.pow(a:7 );
        //then
        Assertions.assertEquals(expected:49, result);
    }
        @Test
        public void shouldReturnPowEuqalToZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.pow(a:0 );
        //then
        Assertions.assertEquals(expected:0, result);
    }
        @Test
        public void shouldReturnPowLessThanZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.pow(a:-3);
        //then
        Assertions.assertEquals(expected:9, result);
    }
}


