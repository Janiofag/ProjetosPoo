public class Substring {
    public static void main(String[] args) {
        String frase = "Desejo terminar Meu Curso";

        String substring = obterSubstring(frase);

        System.out.println("Substring: " + substring);
    }

    public static String obterSubstring(String frase) {
        return frase.substring(0, frase.length() - 1);
    }
}

