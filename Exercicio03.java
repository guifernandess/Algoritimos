
import java.util.Scanner;


public class Exercicio03 {
    public static void main(String[] args) {
        double altura,peso,c;
        Scanner console = new Scanner (System.in);
        System.out.println("Digite sua altura: ");
        altura = console.nextDouble();
        System.out.println("Digite seu peso:");
        peso = console.nextDouble();
        c = peso/Math.pow(altura,2);
        
        if(c<26) {System.out.print("Normal");
        } else if (c>=26 && c<30) {System.out.print("Obeso");
        } else if (c>=30) {System.out.println("Obeso Mórbido");}
       
        
    }
}
