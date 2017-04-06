
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite seu troco:");
        int valor = console.nextInt();
        if (valor >= 100) {
            int resto100 = valor % 100;
            int resultado100 = valor / 100;
            System.out.println("Resto: " + resto100);
            System.out.println("100:" + resultado100);
            if (resto100 >= 50) {
                int resto50 = resto100 % 50;
                int resultado50 = resto100 / 50;
                System.out.println("Resto: " + resto50);
                System.out.println("50: " + resultado50);
                if (resto50 >= 20) {
                    int resto20 = resto50 % 20;
                    int resultado20 = resto50 / 20;
                    System.out.println("Resto: " + resto20);
                    System.out.println("20: " + resultado20);
                    if (resto20 >= 10) {
                        int resto10 = resto20 % 10;
                        int resultado10 = resto20 / 10;
                        System.out.println("Resto: " + resto10);
                        System.out.println("10: " + resultado10);
                        if (resto10 >= 5) {
                            int resto5 = resto10 % 5;
                            int resultado5 = resto10 / 5;
                            System.out.println("Resto: " + resto5);
                            System.out.println("5: " + resultado5);
                            if (resto5 >= 1) {
                                int resto1 = resto5 % 1;
                                int resultado1 = resto5 / 1;
                                System.out.println("Resto: " + resto1);
                                System.out.println("1: " + resultado1);

                            }

                        }
                    }
                }
            }

        }
    }
}
