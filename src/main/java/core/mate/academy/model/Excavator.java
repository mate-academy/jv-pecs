package core.mate.academy.model;

public class Excavator extends Machine {
    private int numberOfTrailer;

    public Excavator(int numberOfTrailer) {
        this.numberOfTrailer = numberOfTrailer;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {

        System.out.println("Excavator started to work");
    }
}
