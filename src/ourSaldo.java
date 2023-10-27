import java.util.Scanner;

public class ourSaldo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        double reajuste = saldo * 1.01;

        System.out.println("O seu saldo com reajuste de 1% agora é: "+reajuste+" .");
    }
}
