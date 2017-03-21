package Algoritimo;

import java.util.Scanner;
/*2. Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3) . Você pode trocar esses números por variáveis.*/

public class Exercicio02 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner console = new Scanner(System.in);
        System.out.print("Insira a Base: ");
        a = console.nextInt();
        System.out.print("Insira a potencia: ");
        b = console.nextInt();
        c = Math.pow(a, b);
        System.out.println("Valor é: " + c);
    }
}
