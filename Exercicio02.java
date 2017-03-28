
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        double a, b, c = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Digite o Valor de A: ");
        a = console.nextDouble();
        System.out.println("Digite o Valor de B: ");
        b = console.nextDouble();

        if (a % b == c) {
            System.out.printf(" A Divisão de %f com %f é exata",a,b);
        } else {
            System.out.println("O Valor tem resto");
        }
    }
}
