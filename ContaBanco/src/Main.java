import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Banco de Terminal!\nVamos começar entrando seus dados.");

        ContaTerminal op = criarConta();

        System.out.println(op);
    }

    private static ContaTerminal criarConta(){
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();

        System.out.println("Agora, digite o número da Conta!");
        numero = scanner.nextInt();

        System.out.println("Já estamos terminando, por favor, digite o seu nome!");
        nomeCliente = scanner.next();

        System.out.println("Por último, digite o seu Saldo!");
        saldo = scanner.nextFloat();

        return  new ContaTerminal(numero, agencia, nomeCliente, saldo);
    }
}