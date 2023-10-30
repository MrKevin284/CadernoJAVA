import java.util.Scanner;

public class Maiorq20print {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = sc.nextDouble();

        if(num >= 20){
            System.out.println(num);
        } else {
            System.out.println("Seu número é menor que 20.");
        }

    }
}

// Objetivo da atividade: Entrar com um número e imprimi-lo caso seja maior que 20;