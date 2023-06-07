import java.util.Scanner;

public class Farmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorProduto;

        do {
            System.out.print("Digite o valor do produto (ou 0 para sair): ");
            valorProduto = scanner.nextDouble();

            if (valorProduto != 0) {
                double valorAjustado = ajustarPreco(valorProduto);
                System.out.println("Valor com acréscimo: " + valorAjustado);
            }
        } while (valorProduto != 0);

        System.out.println("Programa encerrado.");
    }

    public static double ajustarPreco(double valorProduto) {
        double percentualAjuste = 12.0;
        double percentualDecimal = percentualAjuste / 100.0;
        double valorAjustado = valorProduto * (1 + percentualDecimal);

        return Math.round(valorAjustado);
    }
}

