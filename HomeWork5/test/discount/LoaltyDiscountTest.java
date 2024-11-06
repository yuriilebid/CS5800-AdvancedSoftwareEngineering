package HomeWork5.test.discount;

import HomeWork5.discount.LoyaltyDiscount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoyaltyDiscountTest {
    @Test
    void testApplyDiscountGold() {
        LoyaltyDiscount discount = new LoyaltyDiscount();
        assertEquals(90.0, discount.applyDiscount(100, "Gold"));
    }
}

