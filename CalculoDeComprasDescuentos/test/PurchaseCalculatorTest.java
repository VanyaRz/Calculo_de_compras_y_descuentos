import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PurchaseCalculatorTest {

    private final PurchaseCalculator calculator = new PurchaseCalculator();

    private static final double DELTA = 0.001;

    // =========================
    // Pruebas calculateSubtotal
    // =========================

    @Test
    void testCalculateSubtotalNormal() {
        double result = calculator.calculateSubtotal(100, 3);
        assertEquals(300, result, DELTA);
    }

    @Test
    void testCalculateSubtotalQuantityOne() {
        double result = calculator.calculateSubtotal(250, 1);
        assertEquals(250, result, DELTA);
    }

    @Test
    void testCalculateSubtotalPriceZero() {
        double result = calculator.calculateSubtotal(0, 5);
        assertEquals(0, result, DELTA);
    }

    // ========================
    // Pruebas isValidPurchase
    // ========================

    @Test
    void testValidPurchase() {
        assertTrue(calculator.isValidPurchase(100, 2));
    }

    @Test
    void testInvalidPurchasePriceZero() {
        assertFalse(calculator.isValidPurchase(0, 2));
    }

    @Test
    void testInvalidPurchaseQuantityZero() {
        assertFalse(calculator.isValidPurchase(100, 0));
    }

    @Test
    void testInvalidPurchaseNegativePrice() {
        assertFalse(calculator.isValidPurchase(-50, 2));
    }

    // ==========================
    // Pruebas calculateDiscount
    // ==========================

    @Test
    void testDiscountBelowThreshold() {
        double result = calculator.calculateDiscount(999);
        assertEquals(0, result, DELTA);
    }

    @Test
    void testDiscountAtThreshold() {
        double result = calculator.calculateDiscount(1000);
        assertEquals(100, result, DELTA);
    }

    @Test
    void testDiscountAboveThreshold() {
        double result = calculator.calculateDiscount(1500);
        assertEquals(150, result, DELTA);
    }

    // ==========================
    // Pruebas calculateFinalPrice
    // ==========================

    @Test
    void testFinalPriceWithoutDiscount() {
        double result = calculator.calculateFinalPrice(800);
        assertEquals(800, result, DELTA);
    }

    @Test
    void testFinalPriceWithDiscount() {
        double result = calculator.calculateFinalPrice(1500);
        assertEquals(1350, result, DELTA);
    }

    @Test
    void testFinalPriceAtThreshold() {
        double result = calculator.calculateFinalPrice(1000);
        assertEquals(900, result, DELTA);
    }
}