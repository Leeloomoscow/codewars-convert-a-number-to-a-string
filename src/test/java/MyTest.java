import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void tests() {
        assertEquals("67", Kata.numberToString(67));
        assertEquals("123", Kata.numberToString(123));
        assertEquals("999", Kata.numberToString(999));
    }

    private static class Kata {
        public static String numberToString(int num) {
           String str = Integer.toString(num);

            return str;
        }
    }
}