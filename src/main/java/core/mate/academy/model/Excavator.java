package core.mate.academy.model;

public class Excavator extends Machine {
    private int sizeOfWheels;
    private String colorOfTrack;

    public Excavator() {
    }

    public Excavator(int sizeOfWheels, String colorOfTrack) {
        this.sizeOfWheels = sizeOfWheels;
        this.colorOfTrack = colorOfTrack;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
