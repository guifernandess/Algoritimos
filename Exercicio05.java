
import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Digite o Mês (1=janeiro): ");
        int mes = console.nextInt();
        
        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Alta temporada.");
               break;
            case 7:     
            case 6:   
                System.out.println("Baixa temporada.");
                break;
          default;
              System.out.println("Não faz ");
        }
        
    }
    
}
