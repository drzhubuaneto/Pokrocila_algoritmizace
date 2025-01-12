package SEMESTRALKA2025;

public class Station {
    private String name;
    private int cost;
    private int time;
    private Station previousForDistance;
    private Station previousForCost;

    public Station(String name) {
        this.name = name;
        this.cost = Integer.MAX_VALUE;
        this.time = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public Station getPreviousForDistance() {
        return previousForDistance;
    }
    public void setPreviousForDistance(Station previousForDistance) {
        this.previousForDistance = previousForDistance;
    }

    public Station getPreviousForCost() {
        return previousForCost;
    }
    public void setPreviousForCost(Station previousForCost) {
        this.previousForCost = previousForCost;
    }
}
