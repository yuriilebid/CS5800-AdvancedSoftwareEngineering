package HomeWork6.textEditor.test;

import HomeWork6.textEditor.flyweight.FontSizeColor;
import HomeWork6.textEditor.flyweight.FontSizeColorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FontSizeColorFactoryTest {

    @Test
    void testGetFontSizeColor() {
        FontSizeColor color1 = FontSizeColorFactory.getFontSizeColor("Arial", 12, "Red");
        FontSizeColor color2 = FontSizeColorFactory.getFontSizeColor("Arial", 12, "Red");

        assertSame(color1, color2, "Should return the same instance for identical properties");

        FontSizeColor color3 = FontSizeColorFactory.getFontSizeColor("Calibri", 14, "Blue");
        assertNotSame(color1, color3, "Different properties should result in different instances");
    }
}
