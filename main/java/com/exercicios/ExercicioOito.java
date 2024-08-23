import java.util.Scanner;

public class ExercicioOito {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor positivo ou negativo:");
        int numero = scanner.nextInt();

        if (numero == 0 || numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

        scanner.close();
    }
}
