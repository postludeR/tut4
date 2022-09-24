package tut4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    public void add() {
        Calc test = new Calc();
        assertEquals(test.add(1,2), 3);
    }

    @Test
    public void substract() {
        Calc test = new Calc();
        assertEquals(test.substract(2,1), 1);
    }
}