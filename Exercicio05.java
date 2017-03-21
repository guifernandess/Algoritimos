
package Algoritimo;

import java.util.Scanner;

public class Exercicio05 { 
    public static void main(String[] args) {
        double L,P;
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o Valor de L: ");
        L = console.nextInt();
        
        P = (L*L);
        System.out.print("Resultado: "+ P);
    }
    
}
