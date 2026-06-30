import java.util.*;

public class Grafo {

    private Map<Integer, List<Integer>> adjacencias;

    public Grafo() {
        adjacencias = new HashMap<>();
    }

    public void adicionarVertice(int vertice) {
        adjacencias.putIfAbsent(vertice, new ArrayList<>());
    }

    public void adicionarAresta(int origem, int destino) {
        adjacencias.putIfAbsent(origem, new ArrayList<>());
        adjacencias.putIfAbsent(destino, new ArrayList<>());

        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem); // grafo não direcionado
    }

    public Map<Integer, List<Integer>> getAdjacencias() {
        return adjacencias;
    }
}