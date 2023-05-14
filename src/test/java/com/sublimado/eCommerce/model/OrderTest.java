package com.sublimado.eCommerce.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;
    private Article article;
    private Desing desing;

    @BeforeEach
    void setUp() {
        article = new Article();
        desing = new Desing();
        order = new Order();
        order.setArticle(article);
        order.setDesing(desing);
    }

    @Test
    void testIfStockIsLessThanZeroThrowAnException() throws Exception {
        article.setStock(-1);
        assertThrows(Exception.class, () -> order.validateStock());
    }

    @Test
    void testIfStockIsZeroThrowAnException() throws Exception {
        article.setStock(0);
        assertThrows(Exception.class, () -> order.validateStock());
    }

    @Test
    void testIfTheResultIsNegativeWhenDiscountStockThrowAnException() throws Exception {
        order.setNumberOfItems(22);
        article.setStock(20);
        assertThrows(Exception.class, () -> order.discountStock());
    }

    @Test
    void testIfNumberOfItemsIsNegativeWhenDiscountStockThrowAnException(){
        order.setNumberOfItems(-2);
        assertThrows(Exception.class, () -> order.discountStock());
    }

    @Test
    void testIfTheResultWhenDiscountStockIsCorrect(){
        article.setStock(20);
        order.setNumberOfItems(10);

        int valueObtained = article.getStock() - order.getNumberOfItems();
        int valueExpected = 10;

        assertEquals(valueExpected, valueObtained);
    }

    @Test
    void testSumOfArticleAndDesingPrices(){
        article.setPrice(2000.0);
        desing.setPrice(500.0);

        double valueObtained = order.calculateTotalPrice();
        double valueExpected = 2500.0;

        assertEquals(valueExpected, valueObtained);
    }

}