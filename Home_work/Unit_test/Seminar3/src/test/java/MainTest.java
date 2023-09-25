import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    void evenOddNumberTrue() {
        boolean t = Main.evenOddNumber(10);
        assertEquals(t, true);

    }
    @Test
    void evenOddNumberFalse() {
        boolean f = Main.evenOddNumber(9);
        assertEquals(f, false);
    }

    @Test
    void numberInIntervalTrue() {
        boolean t = Main.numberInInterval(50);
        assertEquals(t, true);
    }

    @Test
    void numberInIntervalFalse() {
        boolean f = Main.numberInInterval(5);
        assertEquals(f, false);
    }
}