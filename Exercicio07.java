
package Algoritimo;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner console = new Scanner (System.in);
        System.out.print("Escreva o primeiro lado do Triangulo: ");
        a = console.nextInt();
        System.out.print("Escreva o segundo lado: ");
        b = console.nextInt();
        c = (a*a)+ (b*b);
        System.out.print("Resultado da raiz: "+ Math.sqrt(c));
        
    }
}
