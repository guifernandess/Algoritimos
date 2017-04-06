
import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Digite o dia da semana 1 sábado e 7 domingo:");
        int dia = console.nextInt();
        
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana.");
             break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana.");
                break;
            default :
                
                System.out.println("Invalido");
                
        }
    }
    
    
}
