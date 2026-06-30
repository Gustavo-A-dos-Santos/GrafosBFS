import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void busca(Grafo grafo, int origem) {
        int qteVertices = grafo.quantidadeVertices();
        boolean[] visitado = new boolean[qteVertices];
        Queue<Integer> fila = new LinkedList<>();

        // Inicializa o vértice de origem
        visitado[origem] = true;
        fila.add(origem);

        System.out.println("\n=======================================");
        System.out.println("          EXECUÇÃO DA BFS");
        System.out.println("=======================================");

        while (!fila.isEmpty()) {
            int atual = fila.poll();

            // Pega o nome do vértice ou o próprio número se for nulo
            String nomeAtual = (grafo.getVertices()[atual] != null) ? grafo.getVertices()[atual] : String.valueOf(atual);

            System.out.println("➔ Visitando vértice: [ " + nomeAtual + " ]");

            // Procura vizinhos
            for (int i = 0; i < qteVertices; i++) {
                if (grafo.getMatriz()[atual][i] != 0 && !visitado[i]) {
                    visitado[i] = true;
                    fila.add(i);

                    String nomeVizinho = (grafo.getVertices()[i] != null) ? grafo.getVertices()[i] : String.valueOf(i);
                    System.out.println("   └─ Descobriu vizinho: " + nomeVizinho + " (Adicionado à fila)");
                }
            }

            // Mostra o estado atual da fila de forma limpa
            System.out.print("   STATUS DA FILA: [ ");
            if (fila.isEmpty()) {
                System.out.print("Vazia");
            } else {
                int cont = 0;
                for (Integer v : fila) {
                    String nomeFila = (grafo.getVertices()[v] != null) ? grafo.getVertices()[v] : String.valueOf(v);
                    System.out.print(nomeFila + (cont < fila.size() - 1 ? ", " : ""));
                    cont++;
                }
            }
            System.out.println(" ]\n---------------------------------------");
        }
        System.out.println("=======================================");
    }
}