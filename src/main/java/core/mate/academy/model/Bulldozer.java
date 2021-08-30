package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private String hoistDrive;

    public Bulldozer() {
    }

    public Bulldozer(String bladeType, String hoistDrive) {
        this.bladeType = bladeType;
        this.hoistDrive = hoistDrive;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
