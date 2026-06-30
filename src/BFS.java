import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void executar(int[][] matriz, int inicio) {

        boolean[] visitado = new boolean[matriz.length];
        Queue<Integer> fila = new LinkedList<>();

        visitado[inicio] = true;
        fila.add(inicio);

        while (!fila.isEmpty()) {
            int atual = fila.poll();

            System.out.print(atual + " ");

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[atual][i] == 1 && !visitado[i]) {
                    visitado[i] = true;
                    fila.add(i);
                }
            }
        }
    }
}