package ec.edu.ups.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        calculator = new Calculator();
        System.out.println("setUp");
    }

    @Test
    public void givenTwoIntegersWhenAdditionThenOk(){

        assertEquals(6,calculator.addition(4,2));
        System.out.println("Test 1");

    }

    @Test
    public void givenTwoIntegersWhenSubtractionThenOk(){

        assertEquals(2,calculator.subtraction(4,2));
        System.out.println("Test 2");

    }
    @Test(expected = ArithmeticException.class)
    public void givenTwoIntegersWhenDivisionThenException(){
        assertEquals(3,calculator.division(6,0));
        System.out.println("Test 3");
    }
    @Test(timeout = 150)
    public void givenTwoIntegersWhenMultiplicationThenTimeout(){
        assertEquals(8,calculator.multiplication(4,2));
        System.out.println("Test 4");
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        calculator.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }
}