package ec.epn.edu.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        double x = 4;
        double y = 2;
        System.out.println("Suma (10 + 5): " + calculator.sumar(a, b));
        System.out.println("Resta (10 - 5): " + calculator.restar(a, b));
        System.out.println("Multiplicación (10 * 5): " + calculator.multiplicar(a, b));
        System.out.println("División (10 / 5): " + calculator.dividir(a, b));
        System.out.println("Modulo (10 % 5): " + calculator.modulo(a, b));

        System.out.println("Este es un cambio!!!");

        System.out.println("Potenciación (4 ^ 2): " + calculator.potencia(x, y));
        System.out.println("Segundo Cambio!!");
    }
}
