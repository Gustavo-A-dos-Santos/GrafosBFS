import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Grafo grafo;

    public Menu() {

        scanner = new Scanner(System.in);
        grafo = new Grafo(6);

    }

    public void executar() {

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("      MENU DO GRAFO");
            System.out.println("==============================");
            System.out.println("1 - Carregar grafo de exemplo");
            System.out.println("2 - Exibir matriz de adjacência");
            System.out.println("3 - Exibir grau dos vértices");
            System.out.println("4 - Executar BFS");
            System.out.println("5 - Adicionar aresta");
            System.out.println("6 - Adicionar aresta direcionada");
            System.out.println("7 - Adicionar aresta ponderada");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    carregarGrafoExemplo();
                    break;

                case 2:
                    grafo.imprimirMatriz();
                    break;

                case 3:
                    grafo.imprimirGraus();
                    break;

                case 4:
                    executarBFS();
                    break;

                case 5:
                    adicionarAresta();
                    break;

                case 6:
                    adicionarArestaDirecionada();
                    break;

                case 7:
                    adicionarArestaPonderada();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

    }

        private void carregarGrafoExemplo() {
            // Reinicializa o grafo com espaço para 6 vértices
            grafo = new Grafo(6);

            // Define os nomes dos vértices textualmente
            grafo.adicionarVertice(0, "A");
            grafo.adicionarVertice(1, "B");
            grafo.adicionarVertice(2, "C");
            grafo.adicionarVertice(3, "D");
            grafo.adicionarVertice(4, "E");
            grafo.adicionarVertice(5, "F");

            // Adiciona as conexões (arestas) conforme o desenho do exemplo
            grafo.adicionarAresta(0, 1); // A - B
            grafo.adicionarAresta(0, 2); // A - C
            grafo.adicionarAresta(0, 3); // A - D
            grafo.adicionarAresta(1, 4); // B - E
            grafo.adicionarAresta(4, 5); // E - F
            grafo.adicionarAresta(3, 5); // D - F

            System.out.println("\n Grafo de exemplo (A até F) carregado com sucesso!");
            System.out.println("Dica: Vá na opção [2] para ver a matriz dele ou [7] para testar a BFS!");
        }

    private void executarBFS() {

        System.out.print("Informe o índice do vértice inicial (0 a 5): ");

        int origem = scanner.nextInt();

        BFS.busca(grafo, origem);

    }

    private void adicionarAresta() {

        System.out.print("Origem: ");
        int origem = scanner.nextInt();

        System.out.print("Destino: ");
        int destino = scanner.nextInt();

        grafo.adicionarAresta(origem, destino);

        System.out.println("Aresta adicionada.");

    }

    private void adicionarArestaDirecionada() {

        System.out.print("Origem: ");
        int origem = scanner.nextInt();

        System.out.print("Destino: ");
        int destino = scanner.nextInt();

        grafo.adicionarArestaDirecionada(origem, destino);

        System.out.println("Aresta direcionada adicionada.");

    }

    private void adicionarArestaPonderada() {

        System.out.print("Origem: ");
        int origem = scanner.nextInt();

        System.out.print("Destino: ");
        int destino = scanner.nextInt();

        System.out.print("Peso: ");
        int peso = scanner.nextInt();

        grafo.adicionarArestaPonderada(origem, destino, peso);

        System.out.println("Aresta ponderada adicionada.");

    }

}