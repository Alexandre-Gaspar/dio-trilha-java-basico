import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Locale: Permite escrever valores decimais usando o ponto e não vírgula
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        numero = sc.nextInt();
        System.out.print("Por favor, digite o nome da Agência: ");
        sc.nextLine();
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeDoCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá "
                + nomeDoCliente
                + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta "
                + numero + " e seu saldo "
                + saldo + " já está disponível para saque");
    }
}