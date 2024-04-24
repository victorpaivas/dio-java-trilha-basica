import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Instânciação dos objetos do tipo Conta
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        //Mensagem de boas vindas
        System.out.println("Olá bem vindo ao seu banco digital!");
        System.out.println("Por favor, abaixo iremos pedir algumas informações para abertura da conta.");

        //Entrada de dados
        System.out.print("Por favor digite o número da conta: ");
        conta.numero = scanner.nextInt();

        System.out.print("Digite o número da agência: ");
        conta.agencia = scanner.next();

        System.out.print("Digite o saldo a ser depositado inicialmente: ");
        conta.saldo = scanner.nextDouble();

        System.out.print("Digite o nome completo do titular da conta: ");
        conta.cliente = scanner.nextLine();


        // Saída dos dados
        System.out.println("Olá " + conta.cliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + conta.agencia + " conta " + conta.numero + " e seu saldo R$ " + conta.saldo +
                " já está disponível para saque.");

    }
}