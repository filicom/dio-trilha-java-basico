import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = scanner.nextInt();

        // Consumir a nova linha deixada pelo nextInt
        scanner.nextLine(); 

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo que deseja sacar !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + conta + " e seu saldo " +
        saldo + " já está disponível para saque!");

        // Fechar o scanner após o uso
        scanner.close();
    }
}
