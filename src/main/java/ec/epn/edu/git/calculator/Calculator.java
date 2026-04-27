package ec.epn.edu.git.calculator;

public class Calculator {
    private int respuesta;

    public int sumar(int a, int b){
        return a + b;
    }

    public int restar(int a, int b){
        return a -b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    @SuppressWarnings("ArithmeticException")
    public int dividir(int a, int b){
        return a/b;
    }

    public void timeout(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    @SuppressWarnings("ArithmeticException")
    public int modulo(int a, int b){
        return a%b;
    }
    //Potenciación
    public double potencia(double x, double y){
        return Math.pow(x, y);
    }
}
