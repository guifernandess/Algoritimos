
import java.util.Scanner;

public class Desafiosemana {

    public static void main(String[] args) {
        String diasemana; 
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o dia da semana:");
        int dia = console.nextInt();
        System.out.println("Digite a hora:");
        int hora = console.nextInt();
        System.out.println("Digite o minuto:");
        int min = console.nextInt();
        System.out.println("Digite o segundo:");
        int seg = console.nextInt();

        for (int d = 0; d <= 7; d++) {
            for (int h = 0; h <= 23; h++) {
                for (int m = 0; m <= 59; m++) {
                    for (int s = 0; s <= 59; s++) {
                        System.out.printf("%d   %d:%d:%d \n ", d, h, m, s);
                        if (d == dia && h == hora && m == min && s == seg) {
                            switch (d){
                                case 1: diasemana = "Domingo";
                                break;
                                case 2: diasemana = "Segunda";
                                break;
                                case 3: diasemana = "Terça";
                                break;
                                case 4: diasemana= "Quarta";
                                break;
                                case 5: diasemana = "Quinta";
                                break;
                                case 6: diasemana = "Sexta";
                                break;
                                case 7: diasemana = "Sabado";
                                break;
                                default: diasemana = "Null.";
                            }
                            System.out.printf("%s, %d:%d:%d.", diasemana, h, m, s);
                            break;
                        }

                    }
                    if (m == min) {
                        break;
                    }
                }
                if (h == hora) {
                    break;
                }
            }
            if (d == dia) {
                break;
            }
        }
    }
}
