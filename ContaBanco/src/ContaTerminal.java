import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("Informe o número da sua conta: ");
        numero = ler.nextInt();
        System.out.println("Informe a sua agência: ");
        agencia = ler.next();
        System.out.println("Informe o seu nome: ");
        nomeCliente = ler.next();
        System.out.println("Informe o seu saldo: ");
        saldo = ler.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", Conta "+numero+" e seu saldo de R$"+saldo+" já está disponível para saque");



    }
}
