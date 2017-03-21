
package Algoritimo;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        double a,b,c;
        
        Scanner console = new Scanner (System.in);
        
        System.out.println("Primeiro valor: ");
        a = console.nextDouble();
        System.out.println("Segundo valor: ");
        b = console.nextDouble();
        System.out.println("Terceiro valor: ");
        c = console.nextDouble();
        
        System.out.println("Area do triangulo é " + (a*c)/2 + ".");
        System.out.println("Area do circulo é " + (c*c)*3.14 + ".");
        System.out.println("Area do trapezio é " + ((a+b)/2)*c + ".");
        System.out.println("Area do Quadrado é " + Math.pow(b,b) + ".");
        System.out.println("O perimetro do retangulo é: " + 2*(a+b) + ".");
        
    }
    
}
