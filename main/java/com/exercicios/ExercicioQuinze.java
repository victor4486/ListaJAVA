import java.util.Scanner;

public class ExercicioQuinze {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = scanner.nextDouble();
        System.out.println("Digite as horas trabalhadas no mês:");
        int horasTrabalhadas = scanner.nextInt();

        if (horasTrabalhadas > 160) {
            int horaExtra = horasTrabalhadas - 160;
            double valorExtra = ((((salario / 160) / 100) * 50) * horaExtra);
            double valorTotal = valorExtra + salario;
            System.out.println("O colaborador fez " + horaExtra + " horas extras, e deverá receber o valor total de " + valorTotal + " Reais.");
        } else {
            System.out.println("O colaborador não fez horas extras, deverá receber seu salario normal de " + salario + " Reais.");
        }

        scanner.close();
    }
}
