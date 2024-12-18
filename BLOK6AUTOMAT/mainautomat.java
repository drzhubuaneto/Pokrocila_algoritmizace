package BLOK6AUTOMAT;

public class mainautomat {

public static void main(String[] args) {
    automat automaton = new automat();

    automaton.setInput(0); //nastaveni vstupu
    automaton.next(); //prechod do dalsiho stavu
    System.out.println("aktuálni stav: " + automaton.getState());
    System.out.println("aktuálni vystup: " + automaton.getOutput());

    automaton.setInput(1);
    automaton.next();
    System.out.println("aktuálni stav: " + automaton.getState());
    System.out.println("aktuálni vystup: " + automaton.getOutput());

    automaton.setInput(2);
    automaton.next();
    System.out.println("aktuálni stav: " + automaton.getState());
    System.out.println("aktuálni vystup: " + automaton.getOutput());

    System.out.println("historie stavu: " + automaton.getStateHistory()); //zobrazeni historie
    System.out.println("historie vystupu: " + automaton.getOutputHistory());
    }
}