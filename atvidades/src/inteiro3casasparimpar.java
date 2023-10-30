//Ler um número inteiro de 3 casas decimais e imprimir se o algarismo de casa das centenas
//é par ou impar

import java.util.Scanner;
public class inteiro3casasparimpar {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 3 casas décimais: ");
        int numero = sc.nextInt();

        if(numero >= 100) {
            if (numero % 2 == 0) {
                System.out.println("É par.");
            } else {
                System.out.println("É impar.");
            }
        } else {
            System.out.println("Número Inválido");
        }
    }
}

// Opção por "ia" pq o idiota aqui ainda gosta de complicar as coisas...
//    public class inteiro3casasparimpar {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número inteiro de 3 dígitos:");
//        int numero = scanner.nextInt();
//
//        int centenas = numero / 100; // obtém o dígito das centenas
//
//        if (centenas % 2 == 0) {
//            System.out.println("O algarismo da casa das centenas é par.");
//        } else {
//            System.out.println("O algarismo da casa das centenas é ímpar.");
//        }
//
//        scanner.close();
//    }
//}