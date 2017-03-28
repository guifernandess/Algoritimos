
package continuacaodalista;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double L,R, n1, n2;
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o Valor de L: ");
        L = console.nextDouble();
        System.out.print("Digite o Valor de R: ");
        R = console.nextDouble();
        n1 = Math.pow(L,2);
        n2= 3.14*Math.pow(R,2);
        
        if (n1>n2) { System.out.println("O Quadrado é maior.");
        }
        else if (n2>n1) {
        System.out.println(" O Circulo é maior");
        }
        
         
        
    }
}
