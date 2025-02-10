import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        double saldoConta;

        Scanner scan = new Scanner(System.in);

        System.out.println("-- Bem vindo(a) ao Banco XX");
        System.out.print("Por favor, digite o Número da Agência: ");
        agenciaConta = scan.nextLine();
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scan.nextInt();
        System.out.print("Por favor, digite o seu nome completo: ");
        nomeCliente = scan.nextLine();
        System.out.print("Por favor, digite o seu Saldo: ");
        saldoConta = scan.nextDouble();
        System.out.println("---------");
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo de "+saldoConta+" já está disponível para saque.");

    }
}