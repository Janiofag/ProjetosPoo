import java.util.Scanner;

public class FraseQualquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String frasequalquer = reverterFrase(frase);

        System.out.println("Frase reversa: " + frasequalquer);
    }

    public static String reverterFrase(String frase) {
        String fraseSemEspacos = frase.replaceAll(" ", "");
        StringBuilder reversed = new StringBuilder(fraseSemEspacos).reverse();
        return reversed.toString();
    }
}
