
package Algoritimo;

import java.util.Scanner;


public class Exercicio09 {
    public static void main(String[] args) {
       double b,c;
       int a;
        Scanner console = new Scanner (System.in);
        System.out.print("Cadastro do usuario: ");
        a = console.nextInt();
        System.out.print("Digite a quantidade de horas trabalhada do funcionário: ");
        b = console.nextDouble();
        System.out.print("Digite o quanto o funcinário recebe por hora: ");
        c = console.nextDouble();
        System.out.println("Número de cadastro:"+ a + ". \n Seu salário por hora trabalhada: " +(b*c) );
    }
}
