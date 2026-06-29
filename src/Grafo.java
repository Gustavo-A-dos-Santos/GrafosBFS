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

        System.out.print("   ");

        for(String v : vertices)
            System.out.printf("%4s", v);

        System.out.println();

        for(int i=0;i<matrizAdjacencia.length;i++){

            System.out.printf("%3s",vertices[i]);

            for(int j=0;j<matrizAdjacencia.length;j++){

                System.out.printf("%4d",matrizAdjacencia[i][j]);

            }

            System.out.println();

        }

    }

    public void imprimirGraus(){

        System.out.println("\nGraus dos vértices:");

        for(int i=0;i<matrizAdjacencia.length;i++){

            int grau=0;

            for(int j=0;j<matrizAdjacencia.length;j++){

                if(matrizAdjacencia[i][j]!=0)
                    grau++;

            }

            System.out.println(vertices[i]+" -> Grau "+grau);

        }

    }

}