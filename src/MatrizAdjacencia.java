import java.util.*;

public class MatrizAdjacencia {

    private int[][] matriz;
    private List<Integer> vertices;

    public MatrizAdjacencia(Map<Integer, List<Integer>> grafo) {

        vertices = new ArrayList<>(grafo.keySet());
        Collections.sort(vertices);

        int tamanho = vertices.size();
        matriz = new int[tamanho][tamanho];

        Map<Integer, Integer> indice = new HashMap<>();

        for (int i = 0; i < vertices.size(); i++) {
            indice.put(vertices.get(i), i);
        }

        for (Map.Entry<Integer, List<Integer>> entrada : grafo.entrySet()) {

            int linha = indice.get(entrada.getKey());

            for (Integer destino : entrada.getValue()) {

                Integer coluna = indice.get(destino);

                if (coluna != null) {
                    matriz[linha][coluna] = 1;
                }
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void imprimir() {

        System.out.print("    ");

        for (Integer vertice : vertices) {
            System.out.printf("%3d", vertice);
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {

            System.out.printf("%3d ", vertices.get(i));

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }

            System.out.println();
        }
    }
}