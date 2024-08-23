import java.util.Scanner;

public class ExercicioUm{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ano;
        int meses;
        int dias;
    
        System.out.println("Digite sua idade em anos:");
        ano = scanner.nextInt();

        System.out.println("Digite sua idade em meses:");
        meses = scanner.nextInt();

        System.out.println("Digite sua idade em dias:");
        dias = scanner.nextInt();

        scanner.close();

        int diasAno = ano * 365;
        int diasMeses = meses * 30; 
        int total = diasAno + diasMeses + dias;

        System.out.println("Sua idade atual em dias: " + total );
        
}   
}

