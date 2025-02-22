import java.util.Scanner;

public class exec01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor de a:");
            double a = scanner.nextDouble();
            System.out.println("Digite o valor de b:");
            double b = scanner.nextDouble();
            System.out.println("Digite a operação desejada:* / + -");
            String op = scanner.next();
double result;
result = switch (op) {
    case "+" -> a + b;
    case "-" -> a - b;
    case "*" -> a * b;
    case "/" -> {
        if (a != 0 && b != 0) {
            yield a / b;
        } else {
            System.out.println("Divisão por zero!");
            yield 0;
        }
    }
    default -> {
        System.out.println("Operação inválida!");
        yield 0;
    }
};
            System.out.println("O resultado é: " + result);
        }
    }
}
    