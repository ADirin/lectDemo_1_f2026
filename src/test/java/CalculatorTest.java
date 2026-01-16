import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
Calculator calculator = new Calculator();
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(14, calculator.add(12, 2));

    }

    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(10, calculator.sub(12, 2));
    }

    @org.junit.jupiter.api.Test
    void mul() {
        assertEquals(24, calculator.mul(12, 2));
    }

    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(6, calculator.div(12, 2));
    }
}