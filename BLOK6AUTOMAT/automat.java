package BLOK6AUTOMAT;

import java.util.ArrayList;
import java.util.List;

public class automat {
    private String currentState = "S0"; //stavy a vystupy
    private int currentOutput;
    private int input;
    
    private List<String> stateHistory = new ArrayList<>(); //historie
    private List<Integer> outputHistory = new ArrayList<>();

    private final String[][] transitionTable = { //prechodova tabulka
        {"S2", "S2", "S3"}, //S0
        {"S0", "S1", "S2"}, //S1
        {"S1", "S1", "S0"}, //S2
        {"S0", "S0", "S1"}  //S3
    };

    private final int[] outputTable = {0, 1, 5, 3}; //tabulka vystupu

    public void setInput(int i) { //nastaveni vstupu
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("vstup musi byt 0, 1 nebo 2");
        }
        input = i;
    }

    public int getOutput() { //vraceni vystupu
        return currentOutput;
    }

    public String getState() { //vraceni aktualniho stavu
        return currentState;
    }

    public void next() { //prechod do dalsiho stavu
        if (stateHistory.size() == 5) { //pridani aktualniho stavu a vystupu do historie
            stateHistory.remove(0);
        }
        stateHistory.add(currentState);

        if (outputHistory.size() == 5) {
            outputHistory.remove(0);
        }
        outputHistory.add(currentOutput);

        int stateIndex = Integer.parseInt(currentState.substring(1)); //prechod do noveho stavu
        currentState = transitionTable[stateIndex][input];
        
        stateIndex = Integer.parseInt(currentState.substring(1)); //nastaveni noveho vystupu
        currentOutput = outputTable[stateIndex];
    }

    public List<String> getStateHistory() { //vraceni historie stavu
        return new ArrayList<>(stateHistory);
    }

    public List<Integer> getOutputHistory() { //vraceni historie vystupu
        return new ArrayList<>(outputHistory);
    }
}
