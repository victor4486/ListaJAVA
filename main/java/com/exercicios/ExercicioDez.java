import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota da A1");
        double a1 = scanner.nextDouble();
        System.out.println("Nota da A2");
        double a2 = scanner.nextDouble();
        scanner.close();
        double media = a1 + a2 / 2;

        if (media >= 6) {
            System.out.println("Aluno aprovado, média: " + media);
        } else {
            System.out.println("Aluno reprovado, média: " + media);
        }


    }
}
