import java.util.Scanner;

public class ExercicioSeis{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit");
        double fahrenheit= scanner.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        scanner.close();
        System.out.println("A temperatura em Celsius: " + celsius);
    }
}
