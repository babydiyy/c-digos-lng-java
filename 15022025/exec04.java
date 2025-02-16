import java.util.Scanner;   

public class exec04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA;
        int numB;
        float media;

        System.out.printf("Digite o valor de a: ");
        numA = teclado.nextInt();
        System.out.printf("Digite o valor de b: ");
        numB = teclado.nextInt();
        media =(float)(numA + numB) / 2;
        System.out.printf("Média igual a %.2f\n", media);
        teclado.close();


    }
    
}
