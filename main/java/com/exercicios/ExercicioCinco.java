import java.util.Scanner;

public class ExercicioCinco{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comissaoVenda = 5;
        double valorCarros = 0.0;

        System.out.println("Digite o sálario:");
        double salario = scanner.nextDouble();

        System.out.println("digite a comissão fixa por veiculo:");
        double comissaoFixa = scanner.nextDouble();

        System.out.println("Quantidade de carros vendidos:");
        int quantidadeCarros = scanner.nextInt();

        while (quantidadeCarros > 0) {
            System.out.println("Digite o valor do carro:");
            double valor = scanner.nextDouble();
            valorCarros = valorCarros + valor;
            quantidadeCarros = quantidadeCarros - 1;            
        }

        double comissaoTotal = (((comissaoFixa + comissaoVenda) / 100) * valorCarros);
        double valorTotal = comissaoTotal + salario;
        System.out.println("Valor total de: R$" + valorTotal );
    
    }
}