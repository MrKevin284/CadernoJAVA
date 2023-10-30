import java.util.Scanner;
public class imprimir_raizouquadrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número positivo ou negativo: ");
        double numero = sc.nextDouble();

        if (numero >= 0) {
            System.out.println("A raiz quadrada do número é: " + Math.sqrt(numero));
        } else {
            System.out.println("O quadrado do número é: " + Math.pow(numero, 2));
        }

//entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e quadrado do número caso ele seja negativo
    }
}
