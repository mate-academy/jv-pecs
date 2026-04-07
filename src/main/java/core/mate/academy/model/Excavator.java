package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int arrowLenght;
    private int velumeOfThePorridge;
    private String namePooridge;

    public Excavator(int arrowLenght, int velumeOfThePorridge, String namePooridge) {
        this.arrowLenght = arrowLenght;
        this.velumeOfThePorridge = velumeOfThePorridge;
        this.namePooridge = namePooridge;
    }

    public Excavator() {
        this.arrowLenght = 0;
        this.velumeOfThePorridge = 0;
        this.namePooridge = "noname";
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
