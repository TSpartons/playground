package junit_kick_start;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    Calculator calc = new Calculator();

    @Test
    public void additionTest()
    {
        System.out.println(calc.addition(2,2));
        Assertions.assertEquals(4, calc.addition(2,2));
    }
}
