
package Algoritimo;

import java.util.Scanner;
public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
       float n1, n2;
       float P1, P2;
       float media;
       P1 = 0.4F;
       P2 = 0.6F;
        System.out.println("Calculo Média");
        System.out.print("Nota 01:");
        n1 = console.nextByte();
        System.out.print("Nota 02:");
        n2 = console.nextByte();
        media = (n1*P1)+(n2*P2);
        System.out.println("Média: "+ media);
        System.out.printf("Nome: %s \n Média: %.2f \n");
      
    }
}
