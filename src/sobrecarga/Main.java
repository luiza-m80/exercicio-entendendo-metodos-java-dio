package sobrecarga;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício do Quadrilátero: ");

        System.out.println("Área do quadrado: " + Quadrilatero.area(4));
        System.out.println("Área do retângulo: " + Quadrilatero.area(6, 8));
        System.out.println("Área do trapézio: " + Quadrilatero.area(12, 6, 4));

    }
}
