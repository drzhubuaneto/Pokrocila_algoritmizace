package SEMESTRALKA2025;

public class mainmainmain {
    public static void main(String[] args) {
        Station praha = new Station("Praha");
        Station plzen = new Station("Plzen");
        Station zatec = new Station("Zatec");
        Station kladno = new Station("Kladno");
        Station brno = new Station("Brno");

        ManagementSystem ms = new ManagementSystem();

        ms.addConnection(new Connection(praha, plzen, 90, 150));
        ms.addConnection(new Connection(praha, zatec, 60, 120));
        ms.addConnection(new Connection(praha, kladno, 40, 80));
        ms.addConnection(new Connection(kladno, zatec, 50, 100));
        ms.addConnection(new Connection(plzen, brno, 180, 300));
        ms.addConnection(new Connection(zatec, brno, 200, 250));
        ms.addConnection(new Connection(kladno, brno, 220, 280));
        ms.addConnection(new Connection(praha, brno, 210, 350));
        ms.addConnection(new Connection(zatec, plzen, 100, 200));
        ms.addConnection(new Connection(kladno, plzen, 120, 190));

        ms.performDijkstra(praha);

        ms.printFastestPath(brno, praha);
        ms.printCheapestPath(brno, praha);
        ms.printReachable(praha, 200);
    }
}
