
import java.util.Scanner;


public class Exercicio11 {

 
    public static void main(String[] args) {
       int a ;
        Scanner console = new Scanner (System.in);
        System.out.println("Digite um número: ");
        a = console.nextInt();
        
        if (a<0) {System.out.println("O Valor é negativo");}
        else {System.out.println("Valor positivo é"  +a);}
    }
    
}
