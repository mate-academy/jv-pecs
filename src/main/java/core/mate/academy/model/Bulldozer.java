package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String transmissionType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String transmissionType) {
        setName(name);
        setColor(color);
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
