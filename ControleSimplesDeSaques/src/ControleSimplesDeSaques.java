import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o limite diário de saque
        double limiteDiario = scanner.nextDouble();

        // Variável para armazenar o valor do saque
        double valorSaque;

        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            // TODO: Solicite ao usuário o valor do saque:
            valorSaque = scanner.nextDouble();

            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // TODO: Verifique as condições do valorSaque e o limiteDiario;
            if (valorSaque <= limiteDiario) {
                // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                limiteDiario -= valorSaque;
                // TODO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteDiario);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
