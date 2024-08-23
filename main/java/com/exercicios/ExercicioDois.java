import java.util.Scanner;

public class ExercicioDois{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String municipio;
        int votosBrancos;
        int votosNulos;
        int votosValidos;
        int total;
        double porcentagemBrancos;
        double porcentagemNulos;
        double porcentagemValidos;

        System.out.println("Digite o município:");
        municipio = scanner.nextLine();
        
        System.out.println("Digite a quantidade de votos em branco:");
        votosBrancos = scanner.nextInt();

        System.out.println("Digite a quantidade de votos nulos:");
        votosNulos = scanner.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos:");
        votosValidos = scanner.nextInt();
        
        scanner.close();

        total = votosBrancos + votosNulos + votosValidos; 

        porcentagemBrancos = ((double) votosBrancos / total) * 100;
        porcentagemNulos = ((double) votosNulos / total) * 100;
        porcentagemValidos = ((double) votosValidos / total) * 100;

        System.out.println("Município: " + municipio);
        System.out.println("Total de votos: " + total);
        System.out.println("Porcentagem de votos em branco: " + String.format("%.2f", porcentagemBrancos) + "%");
        System.out.println("Porcentagem de votos nulos: " + String.format("%.2f", porcentagemNulos) + "%");
        System.out.println("Porcentagem de votos válidos: " + String.format("%.2f", porcentagemValidos) + "%");
    }
}
