import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CadastroCliente {  //Interage com o user.
    //perguntar PF ou PJ
    //pedir CPF/CNPJ
    //pedir nome
    //criar objeto Cliente
    //preencher os dados
    Scanner scanner = new Scanner(System.in);
    CadastroCliente Usuario = new CadastroCliente();

    public CadastroCliente(Scanner scanner, CadastroCliente usuario) {
        this.scanner = scanner;
        Usuario = usuario;
    }

    public CadastroCliente getUsuario() {
        return Usuario;
    }
    public void setUsuario(CadastroCliente usuario) {
        Usuario = usuario;
    }

    public void Menu() {
        int opcao;

        do {
            System.out.printf("==== Concessionaria =====\n" +
                    "Olá! Seja bem vindo. Escolha uma opção para iniciar o seu cadastro:\n" +
                    "1. Pessoa Física.\n" +
                    "2. Pessoa Juridica\n" +
                    "3. Sair\n");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        PessoaFisica();
                        break;

                    case 2:
                        PessoaJuridica();
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
        System.out.println(Menu());
    }


    public void PessoaFisica(){
        System.out.println("Beleza! Para seguir o processo, informe o número do seu CPF.");
    }

    public void PessoaJuridica(){
        System.out.println("Ok! Para seguir o processo, informe o número do seu CNPJ.");
    }
}
