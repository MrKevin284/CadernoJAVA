import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        double antecessor = numero - 1;
        double sucessor = numero + 1;

        System.out.println("Os números que antecedem e sucedem o "+numero+" são: \n"+antecessor+"\n"+sucessor);
    }
}
