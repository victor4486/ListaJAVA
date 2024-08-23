import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de maças compradas: ");
        int maças = scanner.nextInt();
        double valor;

        if (maças >= 12){
            valor = 1;
        } else{ valor = 1.30; };

        double valorFinal = valor * maças;

        System.out.println("Valor total: " + valorFinal);
    }
}
