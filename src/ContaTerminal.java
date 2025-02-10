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
        numeroConta = Integer.parseInt(scan.nextLine());

        System.out.print("Por favor, digite o seu nome completo: ");
        nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o seu Saldo: ");
        saldoConta = Double.parseDouble(scan.nextLine());

        System.out.println("---------");
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco,\nsua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo de "+saldoConta+" já está disponível para saque.");
        scan.close();
    }
}