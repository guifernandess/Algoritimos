
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número divido por 3:");
        int n = console.nextInt();
        
        int a = n%3;
        switch (a) {
            case 0:
                System.out.println("O número é divido por 3.");
                break;
            default: 
                   System.out.println("Não é dividido por 3.");
        }
    }
}
