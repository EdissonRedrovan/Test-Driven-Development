package ec.edu.ups.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {

    private int a,b,expected;

    @Parameterized.Parameters
    public  static Iterable<Object[]> parameters(){

        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,9});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,3,10});
        objects.add(new Object[]{22,4,26});
        objects.add(new Object[]{12,14,26});
        return objects;
    }

    public  CalculatorParametersTest(int a,int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void givenParametersWhenAdditionThenOK(){
        Calculator calculator = new Calculator();
        int actual = calculator.addition(a,b);
        assertEquals(expected,actual);
    }
}
