package ZKOUSKA;

public class bellmanford {
    private int[][] adjMatrix; //matice
    private int numVrchol; //pocet vrcholu v grafu

    //hodnoty matice sousednosti jsou vahy hran
    //udelam matici sousednosti grafu - indexy jsou vrcholy

    public bellmanford(int numVrchol) { //matice sousednosti
        this.numVrchol = numVrchol; 
        adjMatrix = new int[numVrchol][numVrchol]; 
        for (int i = 0; i < numVrchol; i++) { 
            for (int j = 0; j < numVrchol; j++) {
                if (i == j) { //vrchol k sobe samymu je 0
                    adjMatrix[i][j] = 0; 
                } else {
                    adjMatrix[i][j] = Integer.MAX_VALUE; //pokud mezi nejakyma vrcholama neni hrana = nekonecno 
                }
            }
        }
    }
    public void addEdge(int poc, int kon, int weight) { //hrany = vaha mezi pocatecnim a konecnym vrcholem
        adjMatrix[poc][kon] = weight; //poc je pocatecni a kon je konecny
    }
    public void execute(int poc) { //spusteni algoritmu z vrcholu src
        int[] distances = new int[numVrchol]; 
        for (int i = 0; i < numVrchol; i++) {
            distances[i] = Integer.MAX_VALUE; //nekonecno od ostatnich vrcholu
        }
        distances[poc] = 0; //pocatecni vrchol hodnota 0
        for (int i = 0; i < numVrchol - 1; i++) {
            for (int u = 0; u < numVrchol; u++) {
                for (int v = 0; v < numVrchol; v++) {
                    if (adjMatrix[u][v] != Integer.MAX_VALUE && distances[u] != Integer.MAX_VALUE &&
                        distances[u] + adjMatrix[u][v] < distances[v]) {
                        distances[v] = distances[u] + adjMatrix[u][v];
                        //projede hrany grafu 
                    }
                }
            }
        }
        for (int u = 0; u < numVrchol; u++) { //kontrola negativnich cyklu = smycka
            for (int v = 0; v < numVrchol; v++) { 
                if (adjMatrix[u][v] != Integer.MAX_VALUE && distances[u] != Integer.MAX_VALUE &&
                    distances[u] + adjMatrix[u][v] < distances[v]) {
                    System.out.println("graf obsahuje negativni vahy");
                    return;
                }
            }
        }
        printArr(distances);
    }

    private void printArr(int[] dist) { //vypis
        System.out.println("vrchol:   vzdalenost od pocatecniho bodu:");
        for (int i = 0; i < numVrchol; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }
}