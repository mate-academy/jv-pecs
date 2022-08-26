package core.mate.academy.model;

public class Excavator extends Machine {
    private int serialNumber;
    private String model;
    private boolean isElectric;

    public Excavator() {

    }

    public Excavator(int serialNumber, String model, boolean isElectric) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.isElectric = isElectric;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
