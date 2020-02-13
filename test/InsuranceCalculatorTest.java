import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    InsuranceCalculator calc;
    @BeforeEach
    public void setup(){
        calc = new InsuranceCalculator();
    }

    @Test
    public void low(){
        double income = 1.0;
        double expected = 0.365;
        double actual = calc.calculateInsurance(income);
        assertEquals(expected, actual);
    }

    @Test
    public void medium(){
        double income = 30000;
        double expected = (income-10000)*0.2+35600;
        double actual = calc.calculateInsurance(income);
        assertEquals(expected, actual);
    }

    @Test
    public void high(){
        double income = 60000;
        double expected = (income-30000)*0.1+76500;;
        double actual = calc.calculateInsurance(income);
        assertEquals(expected, actual);
    }

    @Test
    public void veryHigh(){
        double income = 70000;
        double expected = (income-60000)*0.02+105600;
        double actual = calc.calculateInsurance(income);
        assertEquals(expected, actual);
    }
}