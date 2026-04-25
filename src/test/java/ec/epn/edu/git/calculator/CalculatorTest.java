package ec.epn.edu.git.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void give_two_integers_when_add_then_ok(){
        System.out.println("Test 1");
        int resultado = c.sumar(4,8);
        assertEquals(12, resultado);
    }

    @Test
    public void give_two_integers_when_substraction_then_ok(){
        System.out.println("Test 2");
        int resultado = c.restar(4,8);
        assertEquals(-4, resultado);
    }

    @Test
    public void give_two_integers_when_multiply_then_ok(){
        System.out.println("Test 3");
        int resultado = c.multiplicar(4,8);
        assertEquals(32, resultado);
    }

    @Test
    public void give_two_integers_when_division_then_ok(){
        System.out.println("Test 4");
        int resultado = c.dividir(8,4);
        assertEquals(2, resultado);
    }

    @Test(expected = ArithmeticException.class)
    public void give_two_integers_when_division_to_zero_then_exception(){
        System.out.println("Test 5");
        assertEquals(0, c.dividir(1,0), 0);
    }

    @Test(timeout = 150)
    public void give_two_integers_when_timeout_then_exception(){
        System.out.println("Test 6");
        c.timeout(100);
    }

    @Test
    public void give_two_integers_when_module_then_ok(){
        System.out.println("Test 7");
        int resultado = c.modulo(10,3);
        assertEquals(1, resultado);
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
        c.setRespuesta(0);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }

}