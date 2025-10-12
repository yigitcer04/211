import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    @Test
    void noDiscountUnder50() {
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(40, dc.calculateDiscount(40), 0.001);
    }

    @Test
    void tenPercentBetween50And100() {
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(90, dc.calculateDiscount(100), 0.001);
        assertEquals(45, dc.calculateDiscount(50), 0.001);
    }

    @Test
    void twentyPercentOver100() {
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(160, dc.calculateDiscount(200), 0.001);
    }

    @Test
    void negativeAmountThrowsException() {
        DiscountCalculator dc = new DiscountCalculator();
        assertThrows(IllegalArgumentException.class, () -> dc.calculateDiscount(-10));
    }
}
