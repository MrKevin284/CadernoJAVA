//A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estaduais. O
//valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que
//permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não
//ser concedido.

import java.util.Scanner;
public class emprestimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salário bruto: ");
        double Salario_Bruto = sc.nextDouble();

        System.out.println("Informe o valor da prestação: ");
        double Prestacao = sc.nextDouble();

        double max_Prestacao = Salario_Bruto * 0.30;

        if (Prestacao <= max_Prestacao) {
            System.out.println("O empréstimo pode ser concedido.");
        } else {
            System.out.println("O empréstimo não pode ser concedido.");
        }

    }
}
