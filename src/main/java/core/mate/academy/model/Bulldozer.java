package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int serialNumber;
    private String model;
    private boolean isElectric;

    public Bulldozer() {

    }

    public Bulldozer(int serialNumber, String model, boolean isElectric) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.isElectric = isElectric;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
