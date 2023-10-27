import java.util.Scanner;

public class SuaIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        int anos = sc.nextInt();

        System.out.println("Qual mês você nasceu?");
        int meses = sc.nextInt();

        System.out.println("Qual dia você nasceu?");
        int dias = sc.nextInt();

        int idadeEmDias = (anos * 365) + ((meses - 1) * 30) + dias;

        System.out.println("A sua idade expressa em dias é: " + idadeEmDias);
    }
}
