
import java.util.Scanner;
    
public class exec02 {
    public static void main(String[] args) {
        // Scaneer para entrada de dados 
        Scanner scanner = new Scanner(System.in);

        //variavel para entrada de a
        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        //processamento
        double b = -5*a + 2;

        //saida do resultado
        System.out.println( "O valor de b é: " + b);

        scanner.close();
    }
}