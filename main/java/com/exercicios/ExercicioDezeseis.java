import java.util.Scanner;

public class ExercicioDezeseis{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gastos de Janeiro:");
        double janeiro = scanner.nextDouble();
        System.out.println("Gastos de Fevereiro:");
        double fevereiro = scanner.nextDouble();
        System.out.println("Gastos de Março:");
        double marco = scanner.nextDouble();

        double media = (janeiro + fevereiro + marco) / 3;
        double total = (janeiro + fevereiro + marco);

        System.out.println("A média dos gastos foi: R$ " + String.format("%.2f", media) +
                " Reais, o total dos custos foi: R$ " + String.format("%.2f", total) + " .");

    }
}