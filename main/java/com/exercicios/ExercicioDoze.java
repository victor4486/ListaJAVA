import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        while (numero1 == numero2) {
            System.out.println("Os números não podem ser iguais, escolha outro número:");
            numero2 = scanner.nextInt();
        }

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior: " + numero1);
        } else {
            System.out.println("O segundo número é maior: " + numero2);
        }
    }
}