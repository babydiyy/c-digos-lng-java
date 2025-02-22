
    import java.util.Scanner;
    public class exec03{
      public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do capital:");
            double valorinicial = scanner.nextDouble();

            System.out.println("Digite o valor da taxa de juros:(em %): ");
            double taxaJuros = scanner.nextDouble();

            System.out.println("Digite o valor do tempo em (anos): ");
            int tempo = scanner.nextInt();

            double valorFinal = valorinicial * Math.pow(1 + taxaJuros/100, tempo);
            System.out.printf("O valor final após %d anos: %.2f%n", tempo, valorFinal);
        }
    
}
}
