import java.util.Scanner;

public class Divisivelpor5 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um número:");
            double num = sc.nextDouble();

            double divisivel = num %5;

            System.out.println(divisivel);
            if(divisivel == 0){
                System.out.println("É divisível por 5.");
            } else {
                System.out.println("Não é divisível por 5.");
            }

            //construa um algoritmo que receba um número e informe se é divisível por 5.
        }
    }


