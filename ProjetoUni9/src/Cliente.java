import java.util.Scanner;
import java.util.InputMismatchException;

public class Cliente {
    private String nome;
    private String cadastro;
    private int idade;
    private String contato;

    Scanner scanner = new Scanner(System.in);

    public void cadastroCliente() {
        int opcao;

        do {
            System.out.printf("==== Olá! Seja bem vindo =====\n" +
                    "Escolha uma opção:\n" +
                    "1. Cadastrar com CPF.\n" +
                    "2. Cadastrar com CNPJ\n" +
                    "3. Sair\n");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Beleza! Para seguir o processo, informe o número do seu CPF.");
                        break;

                    case 2:
                        System.out.println("Ok! Para seguir o processo, informe o número do seu CNPJ.");
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida! Digite de 1 a 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Você deve escolher uma opção válida!");
                scanner.nextLine();
                opcao = 0;
            }

        } while (opcao != 3);
    }
}