public class Grafo {

    private String[] vertices;
    private int[][] matrizAdjacencia;

    public Grafo(int quantidadeVertices) {

        vertices = new String[quantidadeVertices];
        matrizAdjacencia = new int[quantidadeVertices][quantidadeVertices];

    }

    public void adicionarVertice(int indice, String nome) {
        vertices[indice] = nome;
    }

    // Grafo não direcionado
    public void adicionarAresta(int origem, int destino) {

        matrizAdjacencia[origem][destino] = 1;
        matrizAdjacencia[destino][origem] = 1;

    }

    // Grafo direcionado
    public void adicionarArestaDirecionada(int origem, int destino) {

        matrizAdjacencia[origem][destino] = 1;

    }

    // Grafo ponderado
    public void adicionarArestaPonderada(int origem, int destino, int peso) {

        matrizAdjacencia[origem][destino] = peso;
        matrizAdjacencia[destino][origem] = peso;

    }

    public int[][] getMatriz() {
        return matrizAdjacencia;
    }

    public String[] getVertices() {
        return vertices;
    }

    public int quantidadeVertices() {
        return vertices.length;
    }

    public void imprimirMatriz() {
        System.out.println("\n========= MATRIZ DE ADJACÊNCIA =========");

        // Cabeçalho dos vértices
        System.out.print("     "); // Espaço para a coluna lateral
        for (int i = 0; i < vertices.length; i++) {
            String nome = (vertices[i] != null) ? vertices[i] : String.valueOf(i);
            System.out.printf("  %s ", nome);
        }
        System.out.println();

        // Linha divisória superior
        System.out.print("    ┌");
        for (int i = 0; i < vertices.length; i++) System.out.print("────");
        System.out.println("┐");

        // Conteúdo da matriz
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            String nomeLinha = (vertices[i] != null) ? vertices[i] : String.valueOf(i);
            System.out.printf("%3s │", nomeLinha); // Vértice da linha e borda lateral

            for (int j = 0; j < matrizAdjacencia.length; j++) {
                int valor = matrizAdjacencia[i][j];

                // Se for 0, podemos colocar um ponto '.' para limpar o visual, ou manter o 0
                if (valor == 0) {
                    System.out.print("  · ");
                } else {
                    System.out.printf("%3d ", valor);
                }
            }
            System.out.println("│");
        }

        // Linha divisória inferior
        System.out.print("    └");
        for (int i = 0; i < vertices.length; i++) System.out.print("────");
        System.out.println("┘");
    }

    public void imprimirGraus() {
        System.out.println("\n========= GRAUS DOS VÉRTICES =========");

        for (int i = 0; i < matrizAdjacencia.length; i++) {
            int grauEntrada = 0;
            int grauSaida = 0;
            boolean temDirecionado = false;

            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (matrizAdjacencia[i][j] != 0) grauSaida++;
                if (matrizAdjacencia[j][i] != 0) grauEntrada++;

                // Verifica se o grafo possui arestas direcionadas (matriz assimétrica)
                if (matrizAdjacencia[i][j] != matrizAdjacencia[j][i]) {
                    temDirecionado = true;
                }
            }

            String nome = (vertices[i] != null) ? vertices[i] : String.valueOf(i);

            // Se o grafo for direcionado, o conceito de grau muda (Entrada e Saída)
            if (temDirecionado) {
                System.out.printf("Vértice %3s ➔ Grau de Saída: %d | Grau de Entrada: %d\n", nome, grauSaida, grauEntrada);
            } else {
                System.out.printf("Vértice %3s ➔ Grau: %d\n", nome, grauSaida);
            }
        }
        System.out.println("======================================");
    }
}