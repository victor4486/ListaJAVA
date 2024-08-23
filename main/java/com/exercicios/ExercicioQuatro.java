import java.util.Scanner;

public class ExercicioQuatro {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double impostos = 0.45 + 0.28;

        System.out.println("Custo do veiculo:");
        double carro = scanner.nextDouble();

        scanner.close();

        double precoFinal = carro + (carro * impostos);

        System.out.println("O preço final do veículo: R$ " + precoFinal);
    }
}
