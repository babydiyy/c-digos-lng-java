import java.util.Scanner;

    public class exec05 {

        public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite a temperatura: ");
            double temp = scanner.nextDouble();

            System.err.println("Escolha a escala de origem (C,F,K): ");
            char origem = scanner.next().charAt(0);

            System.out.println("Escolha a escala de destino (C,F,K):");
            char destino = scanner.next().charAt(0);

            double result;
            result = switch (origem) {
                case 'C' -> switch (destino) {
                    case 'F' -> (temp * 9 / 5) + 32;
                    case 'K' -> temp + 273.15;
                    default -> temp;
                };
                case 'F' -> switch (destino) {
                    case 'C' -> (temp - 32) * 5 / 9;
                    case 'K' -> (temp - 32) * 5 / 9 + 273.15;
                    default -> temp;
                };
                case 'K' -> switch (destino) {
                    case 'C' -> temp - 273.15;
                    case 'F' -> (temp - 273.15) * 9 / 5 + 32;
                    default -> temp;
                };
                default -> {
                    System.out.println("Escala de temperatura inválida!");
                    yield temp;
                }
            };
            System.out.println("Resultado: " + result);
        }
    }
}
            
                
                  
