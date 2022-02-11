package calculadora;

/** Classe de exemplo para a aula 1 de Métodos Java. */

public class Calculadora {

    public static void soma(double a, double b) {
        double resultado = a + b;

        System.out.println("Soma entre " + a + " e " + b + " - " + "Resultado: " + resultado);
    }

    public static void subtracao(double a, double b) {
        double resultado = a - b;

        System.out.println("Subtração entre " + a + " e " + b + " - " + "Resultado: " + resultado);
    }

    public static void divisao(double a, double b) {
        double resultado = a / b;

        System.out.println("Divisão entre " + a + " e " + b + " - " + "Resultado: " + resultado);
    }

    public static void multiplicacao(double a, double b) {
        double resultado = a * b;

        System.out.println("Multiplicação entre " + a + " e " + b + " - " + "Resultado: " + resultado);
    }
}
