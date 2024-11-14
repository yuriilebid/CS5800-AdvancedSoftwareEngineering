package HomeWork6.textEditor.test;

import HomeWork6.textEditor.flyweight.FontSizeColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FontSizeColorTest {

    @Test
    void testEqualsAndHashCode() {
        FontSizeColor color1 = new FontSizeColor("Arial", 12, "Red");
        FontSizeColor color2 = new FontSizeColor("Arial", 12, "Red");
        FontSizeColor color3 = new FontSizeColor("Calibri", 14, "Blue");

        assertEquals(color1, color2, "Objects with same properties should be equal");
        assertNotEquals(color1, color3, "Objects with different properties should not be equal");

        assertEquals(color1.hashCode(), color2.hashCode(), "Hash codes for equal objects should match");
    }
}

