import java.util.Scanner;

public class Menu {

    private final Grafo grafo;
    private final Scanner scanner;

    public Menu() {
        this.grafo = new Grafo();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarAresta();
                    break;

                case 2:
                    exibirMatriz();
                    break;

                case 3:
                    executarBFS();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Adicionar aresta");
        System.out.println("2 - Exibir matriz de adjacência");
        System.out.println("3 - Executar BFS");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarAresta() {
        System.out.print("Origem: ");
        int origem = scanner.nextInt();

        System.out.print("Destino: ");
        int destino = scanner.nextInt();

        grafo.adicionarAresta(origem, destino);

        System.out.println("Aresta adicionada com sucesso.");
    }

    private void exibirMatriz() {
        MatrizAdjacencia matriz =
                new MatrizAdjacencia(grafo.getAdjacencias());

        matriz.imprimir();
    }

    private void executarBFS() {
        MatrizAdjacencia matriz =
                new MatrizAdjacencia(grafo.getAdjacencias());

        System.out.print("Vértice inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("BFS: ");
        BFS.executar(matriz.getMatriz(), inicio);
        System.out.println();
    }
}
