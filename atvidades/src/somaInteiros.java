import java.util.Scanner;
public class somaInteiros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um número inteiro.");
        int num1 = sc.nextInt();
        System.out.println("insira outro número inteiro.");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        if(soma >= 10){
            System.out.println(soma);
        } else {
            System.out.println("O valor é inferior a 10.");
        }


        //construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; caso o
        //resultado seja maior que 10, apresentá-lo
    }
}
