import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        String nomeCliente;
        int numeroConta; 
        String agencia;
        float saldo;

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da agência:");
        agencia = sc.next();
        sc.nextLine(); 
        System.out.println("Por favor, digite o saldo da conta:");
        saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$mar%.2f já está disponível para saque.\n", 
                          nomeCliente, agencia, numeroConta, saldo);

    }
}
