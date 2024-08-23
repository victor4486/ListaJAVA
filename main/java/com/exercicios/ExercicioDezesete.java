import java.util.Scanner;

public class ExercicioDezesete{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite a nota da API: ");
        double API = scanner.nextDouble();

        System.out.print("Digite a nota da SUB: ");
        double SUB = scanner.nextDouble();

        System.out.print("Digite a nota do X: ");
        double X = scanner.nextDouble();

        double mediaParcial = (P1 * 0.6) + ((E1 + E2) / 2) * 0.4;

        double maxTermo = Math.max(mediaParcial - 5.9, 0) / (mediaParcial - 5.9);

        double mediaFinal = (mediaParcial * 0.5) + (maxTermo * API * 0.5) + X + (SUB * 0.2);

        System.out.printf("A média de LP1 deste semestre é: %.2f%n", mediaFinal);

        scanner.close();
    }
}
