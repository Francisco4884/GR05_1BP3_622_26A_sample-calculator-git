package ec.epn.edu.git.calculator;

public class Calculator {
    public int sumar(int a, int b){
        return a + b;
    }
    public int restar(int a, int b){
        return a -b;
    }
    public int multiplicar(int a, int b){
        return a * b;
    }
    public int dividir(int x, int y){
        if(y == 0){
            throw new  ArithmeticException("No se puede dividir por cero");
        }
        return x/y;
    }


}
