import java.util.Random;

public class SimuladorJogadaDado{
    public static void main(String[] args) {
        int total = 0;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int jogada = random.nextInt(6) + 1;
            total += jogada;
            System.out.println("Jogada " + (i + 1) + ": " + jogada);
        }

        System.out.println("Total das jogada: " + total);
    }
}

