
package Algoritimo;

import java.util.Scanner;


public class Exercicio10 {
    
    public static void main(String[] args) {
        
        String name;
        double salario;
        double vendas;
        
        double C = 0.15;
        
        Scanner console = new Scanner (System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        name = console.next();
        System.out.println("Digite o salario: ");
        salario = console.nextDouble();
        System.out.println("Digite o total de vendas");
        vendas = console.nextDouble();
        
        System.out.println("O valor recebido do salario mais as vendas é: " + ((vendas*C)+salario));
        
        
    }
    
}
