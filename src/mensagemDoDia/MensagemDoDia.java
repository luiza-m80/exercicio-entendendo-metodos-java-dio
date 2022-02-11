package mensagemDoDia;

public class MensagemDoDia {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11 -> mensagemBomDia();
            case 12, 13, 14, 15, 16, 17, 18 -> mensagemBoaTarde();
            case 19, 20, 21, 22, 23, 24 -> mensagemBoaNoite();
            default -> System.out.println("Boa madrugada! Vai dormir!!");
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia! :)");
    }
    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde! :)");
    }
    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite! :)");
    }
}
