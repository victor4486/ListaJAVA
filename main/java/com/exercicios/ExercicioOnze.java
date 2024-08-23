import java.util.Scanner;
import java.time.LocalDate;

public class ExercicioOnze{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int nascimento = scanner.nextInt();

        LocalDate dataAtual = LocalDate.now();
        int anoAtual= dataAtual.getYear();

        int idade = anoAtual - nascimento;

        if (idade >= 16){
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Menosres de 16 anos não podem votar.");
        }

    }
}
