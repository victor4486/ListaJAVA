import java.util.Scanner;

public class ExercicioQuatorze{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hora de inicio:");
        int inicio = scanner.nextInt();
        System.out.println("Hora do fim:");
        int fim = scanner.nextInt();
        int tempoDeJogo = (fim - inicio);

        if (tempoDeJogo >= 24) {
            System.out.println("Um jogo não pode ter mais do que 24 horas, digite a hora do final correta.");
            fim = scanner.nextInt();
            tempoDeJogo = (fim - inicio);

            while (tempoDeJogo >= 24){
                System.out.println("Um jogo não pode ter mais do que 24 horas, digite a hora do final correta.");
                fim = scanner.nextInt();
                tempoDeJogo = (fim - inicio);
            }
        } else if (tempoDeJogo < 24 && inicio > fim) {

            tempoDeJogo = (24 - inicio) + fim;
        }

        System.out.println("O tempo do jogo foi: " + tempoDeJogo + " horas.");
        scanner.close();

}
}
