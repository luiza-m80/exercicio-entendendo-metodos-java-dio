package emprestimo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício do empréstimo: ");
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1500, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(2000, 5);
    }
}
