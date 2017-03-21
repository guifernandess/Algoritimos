
package Algoritimo;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double a,b;
        double processo;
 
    Scanner console = new Scanner (System.in);
        System.out.print("Numero: ");
  a = console.nextInt();
        System.out.print("Numero2: ");
  b = console.nextInt();
  processo = (a*b);
        System.out.println("Resultado: " + processo);
}
}