import java.util.Scanner;

public class VerificaConteudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        if (verificaConteudo(frase)) {
            System.out.println("Conteúdo impróprio");
        } else {
            System.out.println("Conteúdo liberado");
        }
    }

    public static boolean verificaConteudo(String frase) {
        String[] palavras = frase.toLowerCase().split(" ");

        for (String palavra : palavras) {
            if (palavra.equals("sexo") || palavra.equals("sexual")) {
                return true;
            }
        }

        return false;
    }
}

