package com.sublimado.eCommerce.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesingTest {

    private Desing desing;
    private DesingType type;

    @BeforeEach
    void setUp() {

        type = new DesingType();
        type.setPrice(200);
        type.setType("Photo");

        desing = new Desing();
        desing.setDesingColor(true);
        desing.setPrice(1000.0);
        desing.setDesingType(type);
    }

    @Test
    void testCalculatePercentageIfTheColorIsTrue() throws Exception {
        double percentage = 1;
        double valueObtained = desing.calculatePriceByColor(percentage);
        double valueExpected = 100.0;
        assertEquals(valueExpected, valueObtained);
    }

    @Test
    void testReturnZeroIfTheColorIsFalse() throws Exception{
        desing.setDesingColor(false);
        double percentage = 1;
        double valueObtained = desing.calculatePriceByColor(percentage);
        double valueExpected = 0.0;
        assertEquals(valueExpected, valueObtained);
    }

    @Test
    void testIfPercentageEnteredIsNegativeThrowAnException() throws Exception{
        double percentage = -1;
        assertThrows(Exception.class, () -> desing.calculatePriceByColor(percentage));
    }

    @Test
    void testIfPercentageEnteredIsZeroThrowAnException() throws Exception{
        double percentage = 0.0;
        assertThrows(Exception.class, () -> desing.calculatePriceByColor(percentage));
    }

    @Test
    void testSumTotalPrice() throws Exception {
        double percentage = 1;
        double valueObtained = desing.calculateTotalPrice(percentage);
        double valueExpected = 1300.0;
        assertEquals(valueExpected, valueObtained);
    }



}