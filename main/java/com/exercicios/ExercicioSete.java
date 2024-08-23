import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero == 10){
            System.out.println("O número é 10");
        } if (numero < 10){
            System.out.println("O número é menor que 10");
        } if (numero > 10){
            System.out.println("O número é maior que 10"); };

        scanner.close();

    }
}
