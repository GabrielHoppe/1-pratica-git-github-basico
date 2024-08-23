import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
public class App {
    private Lista lista;  // Colecao de compras
    private Scanner entrada;    // Entrada de dados do sistema

    /**
     * Construtor da aplicacao
     */
    public App() {
        lista = new Lista();
        entrada = new Scanner(System.in);   // Usar o teclado
        entrada.useLocale(Locale.ENGLISH);  // Usar . como decimal
    }

    /**
     * Executa a aplicacao
     * Termina quando o usuario digitar a opcao 0
     */
    public void executar() {
        System.out.println("Aplicacao de compras executando...");
        int opcao;

        do {
            menu();
            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    cadastraCompra();
                    break;
                case 2:
                    consultarCompraPeloCodigo();
                    break;
                case 3:
                    consultaPorDescricao();
                    break;
                case 99:
                    easterEgg();
                    break;
                default:
                    System.out.println("Opcao invalida. Redigite.");
            }

        } while (opcao != 0);

    }

    /**
     * Apresenta o menu de opcoes do sistema para o usuario
     */
    private void menu() {
        System.out.println("============================");
        System.out.println("APLICACAO DE COMPRAS");
        System.out.println("Opcoes:");
        System.out.println("[0] Terminar.");
        System.out.println("[1] Cadastrar uma compra.");
        System.out.println("[2] Consultar uma compra pelo codigo.");
        System.out.println("[3] Consultar várias contas por parte de uma descrição.");
    }
}