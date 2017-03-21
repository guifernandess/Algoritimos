
package Algoritimo;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner console = new Scanner  (System.in);
        
        System.out.println("Insira o primeiro valor: ");
        a = console.nextInt();
        System.out.println("Insira o segundo valor: ");
        b = console.nextInt();
        System.out.println("Insira o terceiro valor: ");
        c = console.nextInt();
        System.out.println("Insira o quarto valor: ");
        d = console.nextInt();
        System.out.println("A media simples é: " + (a+b+c+d)/4 + ".");
    }
    
}
