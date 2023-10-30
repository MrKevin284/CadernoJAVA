import java.util.Scanner;
public class nultiplode3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        int multiplo = num %3;

        System.out.println(multiplo);
        if(multiplo == 0){
            System.out.println("É múltiplo de 3.");
        } else {
            System.out.println("Não é múltiplo de 3.");
        }
        //construa um algoritmo que receba um número e informe se é múltiplo de 3.
    }
}
