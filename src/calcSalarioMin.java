import java.util.Scanner;

public class calcSalarioMin {
    public static void main(String[] args){
    // SC = Scanner;
        Scanner sc = new Scanner(System.in);

    // SM = Salário Mínimo;
        float SM = 1320;

        System.out.println("Informe seu salário atual: ");
        float salario = sc.nextFloat();

        float quantidadeSalarios = salario / SM;

        System.out.printf("O usuário ganha %.2f salários mínimos.\n", quantidadeSalarios);

    }
}
