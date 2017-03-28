
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        double kws, n1,n2,n3;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite seu kWh:");
        kws = console.nextDouble();

        if (kws < 150) {
            n1 = kws * 0.20; 
            if (n1 < 11.90) {
               System.out.println("Valor minimo é 11,90!");
            } else { System.out.println("O Valor é "+ n1);
          }
        }else if(kws>=150 && kws<500) {
        n2 = kws*0.25;
            System.out.println("Valor é" +n2);
    } 
        else if (kws>=500)  {
        n3 = kws*0.30;
        System.out.println("Valor é" +n3);
    }
        }
    
    }
