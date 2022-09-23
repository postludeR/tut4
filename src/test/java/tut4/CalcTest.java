package tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        Calc test = new Calc();
        assertEquals(test.add(1,2), 3);
    }
}