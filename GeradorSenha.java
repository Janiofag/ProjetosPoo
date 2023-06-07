import java.util.Random;

public class GeradorSenha {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(6) + 5;
        String senha = gerarSenhaNumerica(numeroAleatorio);

        System.out.println("Número sorteado: " + numeroAleatorio);
        System.out.println("Senha: " + senha);
    }

    public static String gerarSenhaNumerica(int numeroDigitos) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < numeroDigitos; i++) {
            int digito = random.nextInt(10);
            senha.append(digito);
        }

        return senha.toString();
    }
}

