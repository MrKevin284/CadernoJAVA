// Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não é divisível
//por nenhum destes

import java.util.Scanner;
public class multiplode1052 {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        if(num %10 == 0){
            System.out.println("O número é divisível por 10.");
        } else if(num %5 == 0){
            System.out.println("O número é divisível por 5.");
        } else if(num %2 == 0){
            System.out.println("O número é divisível por 2.");
        } else {
            System.out.println("O número não é divisível por 10, 5 ou 2.");
        }

    }
}
