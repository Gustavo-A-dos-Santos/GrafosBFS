import java.util.ArrayList;
import java.util.List;

public class Node {

    private String nome;
    private List<Node> vizinhos;

    public Node(String nome) {
        this.nome = nome;
        this.vizinhos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Node> getVizinhos() {
        return vizinhos;
    }

    public void adicionarVizinho(Node node) {
        vizinhos.add(node);
    }

    @Override
    public String toString() {
        return nome;
    }
}