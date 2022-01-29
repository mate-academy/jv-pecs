package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bucketType;
    private String hoistDriveMechanism;

    public Bulldozer(String bucketType, String hoistDriveMechanism) {
        this.bucketType = bucketType;
        this.hoistDriveMechanism = hoistDriveMechanism;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
