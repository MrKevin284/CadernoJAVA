import java.util.Scanner;
public class calculoIPI {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a porcentagem do IPI:");
            double ipi = scanner.nextDouble();

            System.out.println("Digite o código da peça 1, valor unitário da peça 1, quantidade de peças 1:");
            int codigo1 = scanner.nextInt();
            double valor1 = scanner.nextDouble();
            int quant1 = scanner.nextInt();

            System.out.println("Digite o código da peça 2, valor unitário da peça 2, quantidade de peças 2:");
            int codigo2 = scanner.nextInt();
            double valor2 = scanner.nextDouble();
            int quant2 = scanner.nextInt();

            double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

            System.out.printf("O valor total a ser pago é: %.2f\n", total);
        }
    }

