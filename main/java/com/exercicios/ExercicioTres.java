import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salario;
        double porcentagem;
        double aumento;

        System.out.println("Salário mensal:");
        salario = scanner.nextDouble();
        System.out.println("Porcentagem de aumento:");
        porcentagem = scanner.nextDouble();

        scanner.close();

        aumento = (salario/100) * porcentagem;        

        System.out.println("O aumento salarial foi de " + aumento + " reais, portanto seu novo salário é de: " + (salario + aumento)) ;
    }
    
} 
