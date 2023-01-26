package com.niit.pizzaorderingsystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaOrderingTest {
    PizzaOrdering pizzaOrdering;

    @BeforeEach
    void setUp() {
        pizzaOrdering = new PizzaOrdering();
    }

    @AfterEach
    void tearDown() {
        pizzaOrdering = null;
    }

    /* NOTE: Write minimum of 4 assert statements for each test case */

    @Test
    public void givenPizzaChoiceAndSizeCalculateBill() {
    }

    @Test
    public void givenCrustChoiceEstimatePrice() {
    }

    @Test
    public void givenToppingsChoiceEstimatePrice() {
    }

    @Test
    public void givenCrustAndToppingsCostCalculateTotalBill() {
    }

    @Test
    public void givenBreadChoiceCalculateTotalBill() {
    }

    @Test
    public void givenDrinksChoiceCalculateTotalBill() {
    }

    @Test
    public void givenTotalBillEstimateDiscountAmount() {
    }

    @Test
    public void givenDeliveryAndTipChargeCalculateFinalBill() {
    }

}
