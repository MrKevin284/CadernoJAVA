import java.util.Scanner;
public class Somacomadicionaloumenos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;

        if(soma >= 20){
            System.out.println(soma + 8);
        } else{
            System.out.println(soma - 5);
        }

    //construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja
    //maior que 20, este deverá ser apresentado somando-se ele mais 8; caso o valor seja menor ou igual
    //a 20, este deverá ser apresentado subtraindo-se 5
    }
}
