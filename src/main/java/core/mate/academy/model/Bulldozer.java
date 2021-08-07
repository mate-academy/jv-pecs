package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String type;
    private int operatingWeight;

    public Bulldozer() {
    }

    public Bulldozer(String type, int operatingWeight) {
        this.type = type;
        this.operatingWeight = operatingWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
