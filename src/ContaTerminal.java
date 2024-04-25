import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Instânciação dos objetos do tipo Conta
        Conta conta = new Conta();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        //Mensagem de boas vindas
        System.out.println("Olá bem vindo ao seu banco digital!");
        System.out.println("Por favor, abaixo iremos pedir algumas informações para abertura da conta.");

        //Entrada de dados
        System.out.print("Digite seu nome: ");
        conta.nomeCliente = input.next();

        System.out.print("Digite seu sobrenome: ");
        conta.sobrenomeCliente = input.next();

        System.out.print("Digite o número da sua conta: ");
        conta.numero = input.nextInt();

        System.out.print("Digite sua agência: ");
        conta.agencia = input.next();

        System.out.print("Digite o saldo a ser depositado: ");
        conta.saldo = input.nextDouble();


        // Saída dos dados
        System.out.println("Olá " + conta.nomeCliente + " " + conta.sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + conta.agencia + " conta " + conta.numero);
        System.out.println(" e seu saldo R$" + conta.saldo +
                " já está disponível para saque.");

    }
}