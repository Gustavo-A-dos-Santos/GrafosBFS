import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void busca(Grafo grafo, int origem){

        boolean visitado[] = new boolean[grafo.quantidadeVertices()];

        Queue<Integer> fila = new LinkedList<>();

        visitado[origem]=true;

        fila.add(origem);

        System.out.println("\n===== EXECUÇÃO DA BFS =====\n");

        while(!fila.isEmpty()){

            int atual=fila.poll();

            System.out.println("Visitando: "
                    +grafo.getVertices()[atual]);

            for(int i=0;i<grafo.quantidadeVertices();i++){

                if(grafo.getMatriz()[atual][i]!=0 && !visitado[i]){

                    visitado[i]=true;

                    fila.add(i);

                    System.out.println(
                            "   Encontrado "
                                    +grafo.getVertices()[i]
                                    +" -> Inserido na fila.");

                }

            }

            System.out.print("Fila: ");

            for(Integer v : fila)
                System.out.print(grafo.getVertices()[v]+" ");

            System.out.println("\n");

        }

    }

}