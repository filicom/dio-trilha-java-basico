import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        try {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();
            
            // Chamando o método que realiza a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprimir mensagem de erro se a exceção for lançada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } finally {
            // Fechar o Scanner para liberar o recurso
            terminal.close();
        }
    }

    // Método de contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é maior que o segundo
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Realizar o laço for para contar de parametroUm até parametroDois
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Definir a exceção personalizada
class ParametrosInvalidosException extends Exception {
}