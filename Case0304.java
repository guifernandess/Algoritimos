
package case0304;



public class Case0304 {

    public static void main(String[] args) {
 
        char grade = 'C';
switch (grade) {
    case 'A' :
        System.out.print("Excelente");
    //break;
    case 'B':
    case 'C':
        System.out.println("Bem feito");
    //break;
    case 'D':
        System.out.println("Você passou!");
    case 'E':
        System.out.println("Melhor tentar novamente.");
       //break;
    default :
        System.out.println("Conceito inválido");
           
      
}
    }
    
}
