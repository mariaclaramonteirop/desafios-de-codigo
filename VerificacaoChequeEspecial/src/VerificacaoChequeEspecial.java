import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o saldo atual da conta bancária
        double saldo = scanner.nextDouble();

        // Solicita ao usuário que informe o valor do saque
        double saque = scanner.nextDouble();

        // Define o limite do cheque especial
        double limiteChequeEspecial = 500;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
            double saldoTotalComChequeEspecial = saldo + limiteChequeEspecial;
            if (saque <= saldoTotalComChequeEspecial) {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
