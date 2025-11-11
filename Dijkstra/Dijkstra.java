import java.util.*;

public class Dijkstra {
    static final int INF = Integer.MAX_VALUE; // Infinito

    // Método para aplicar el algoritmo de Dijkstra
    public static void dijkstra(int[][] grafo, int origen) {
        int n = grafo.length;
        int[] distancia = new int[n];
        boolean[] visitado = new boolean[n];

        // Inicializar todas las distancias como infinito
        Arrays.fill(distancia, INF);
        distancia[origen] = 0;

        for (int i = 0; i < n - 1; i++) {
            // Escoger el nodo no visitado con menor distancia
            int u = nodoMinimo(distancia, visitado);
            visitado[u] = true;

            // Actualizar las distancias de los vecinos del nodo u
            for (int v = 0; v < n; v++) {
                if (!visitado[v] && grafo[u][v] != 0 && distancia[u] != INF
                        && distancia[u] + grafo[u][v] < distancia[v]) {
                    distancia[v] = distancia[u] + grafo[u][v];
                }
            }
        }

        // Mostrar resultados
        mostrarResultado(distancia, origen);
    }

    // Método para obtener el nodo con la menor distancia
    public static int nodoMinimo(int[] distancia, boolean[] visitado) {
        int min = INF, indiceMin = -1;
        for (int i = 0; i < distancia.length; i++) {
            if (!visitado[i] && distancia[i] <= min) {
                min = distancia[i];
                indiceMin = i;
            }
        }
        return indiceMin;
    }

    // Mostrar las distancias finales
    public static void mostrarResultado(int[] distancia, int origen) {
        System.out.println("Distancias mínimas desde el nodo " + origen + ":");
        for (int i = 0; i < distancia.length; i++) {
            if (distancia[i] == INF)
                System.out.println("Nodo " + i + " -> No alcanzable");
            else
                System.out.println("Nodo " + i + " -> " + distancia[i]);
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Matriz de adyacencia del grafo (0 = sin conexión)
        int[][] grafo = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int origen = 0; // Nodo inicial
        dijkstra(grafo, origen);
    }
}
