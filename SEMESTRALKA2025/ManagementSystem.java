package SEMESTRALKA2025;

import java.util.*;

public class ManagementSystem {
    private List<Connection> connections = new ArrayList<>();
    private Map<String, Station> stations = new HashMap<>();

    public void addConnection(Connection connection) {
        connections.add(connection);
        stations.putIfAbsent(connection.getSource().getName(), connection.getSource());
        stations.putIfAbsent(connection.getDestination().getName(), connection.getDestination());
    }

    public void performDijkstra(Station source) {
        PriorityQueue<Station> queue = new PriorityQueue<>(Comparator.comparingInt(Station::getTime));
        
        for (Station station : stations.values()) {
            station.setTime(Integer.MAX_VALUE);
            station.setCost(Integer.MAX_VALUE);
            station.setPreviousForDistance(null);
            station.setPreviousForCost(null);
        }

        source.setTime(0);
        source.setCost(0);
        queue.add(source);

        while (!queue.isEmpty()) {
            Station current = queue.poll();

            for (Connection connection : connections) {
                if (connection.getSource().equals(current)) {
                    Station neighbor = connection.getDestination();

                    int newDistance = current.getTime() + connection.getTime();
                    int newCost = current.getCost() + connection.getCost();

                    if (newDistance < neighbor.getTime()) {
                        neighbor.setTime(newDistance);
                        neighbor.setPreviousForDistance(current);
                        queue.add(neighbor);
                    }

                    if (newCost < neighbor.getCost()) {
                        neighbor.setCost(newCost);
                        neighbor.setPreviousForCost(current);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public void printFastestPath(Station destination, Station source) {
        List<Station> path = new ArrayList<>();
        Station current = destination;

        while (current != null) {
            path.add(current);
            current = current.getPreviousForDistance();
        }

        Collections.reverse(path);

        System.out.println("nejkratsi cesta na trase " + source.getName() + " - " + destination.getName() + " je:");
        System.out.println(destination.getTime() + " minut");
    }
    

    public void printCheapestPath(Station destination, Station source) {
        List<Station> path = new ArrayList<>();
        Station current = destination;

        while (current != null) {
            path.add(current);
            current = current.getPreviousForCost();
        }

        Collections.reverse(path);

        System.out.println("nejlevnejsi cesta na trase " + source.getName() + " - " + destination.getName() + " stoji:");
        System.out.println(destination.getCost() + " korun");
    }



    public void printReachable(Station source, int maxTime) {
        System.out.println("mesta dostupna ze stanice " + source.getName() + " pod " + maxTime + " minut:");
        for (Station station : stations.values()) {
            if (station.getTime() <= maxTime) {
                System.out.println(station.getName() + " (" + station.getTime() + " minut)");
            }
        }
    }    
}