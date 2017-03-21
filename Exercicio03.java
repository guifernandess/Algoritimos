
package Algoritimo;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        a = console.nextInt();
        System.out.print("Digite o segundo número: ");
        b = console.nextInt();
        c = Math.pow(a, b);
        System.out.println("Resultado: " + c);
    }
    
}
