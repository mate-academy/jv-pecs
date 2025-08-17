package core.mate.academy.model;

public class Truck extends Machine {
    private String platformType;
    private String purpose;

    public Truck() {
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
