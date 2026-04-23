package test;

import ec.epn.edu.git.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalcultaorTest {

    @Test
    public void sumaPrueba(){
        Calculator calc = new Calculator();
        int resultado = calc.sumar(4,8);
        assertEquals(12, resultado);
    }

    @Test
    public void restaPrueba(){
        Calculator calc = new Calculator();
        int resultado = calc.restar(4,8);
        assertEquals(-4, resultado);
    }

    @Test
    public void multiplicacionPrueba(){
        Calculator calc = new Calculator();
        int resultado = calc.multiplicar(4,8);
        assertEquals(32, resultado);
    }

    @Test
    public void divisionPrueba(){
        Calculator calc = new Calculator();
        int resultado = calc.dividir(8,4);
        assertEquals(2, resultado);
    }

    @Test
    public void divisionPorCeroPrueba(){
        Calculator calc = new Calculator();

        assertThrows(
                ArithmeticException.class,
                () -> calc.dividir(10,0)
        );
    }

}
