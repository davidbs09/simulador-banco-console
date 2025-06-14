import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco();
        Cliente cliente = new Cliente();

        // Cadastro do Cliente
        System.out.println("Digite o seu nome para o cadastro");
        cliente.setNomeCliente(scan.nextLine());
        System.out.println("Cadastro realizado !\n" + cliente.getNomeCliente() + ", Seja muito bem vindo.\n"
                + "Agora vamos cadastrar a sua conta.\n");

        // Cadastro da Conta Bancária
        int escolhaBanco;
        boolean sucesso = false;

        do {
            System.out.println("Escolha o banco desejado para abrir a conta:");
            System.out.println("1 - Itaú");
            System.out.println("2 - Santander");
            System.out.println("3 - Bradesco");
            System.out.println("4 - Caixa");
            System.out.println("5 - Banco do Brasil");
            System.out.print("Digite o número do banco desejado: \n");

            if (scan.hasNextInt()) {
                escolhaBanco = scan.nextInt();
                sucesso = banco.selecionarBanco(escolhaBanco);
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scan.next();
                sucesso = false;
            }
        } while (!sucesso);

        System.out.println("Parabéns pela escolha!\n");

        // Login na Conta
        // Primeiro ele gera o número da conta e depois o usuário informa o número da conta para logar
        int numeroConta = (int) (Math.random() * 101);
        String numeroContaStr = String.valueOf(numeroConta);
        System.out.println("Seu número de conta é: " + numeroContaStr + "\n");

        System.out.println("Digite o número da sua conta:");
        cliente.setNumeroConta(scan.next());

        System.out.println("Digite o número da agência");
        banco.setAgencia(scan.next());

        System.out.println("Digite o valor do depósito inicial:");
        cliente.setSaldo(scan.nextFloat());

        scan.close();

        // Exibição dos Dados do Cliente e Conta
        System.out.println("Olá " + cliente.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                banco.getAgencia() + ", conta " + cliente.getNumeroConta() +
                " e seu saldo " + cliente.getSaldo() + " já está disponível para saque.");
    }
}
