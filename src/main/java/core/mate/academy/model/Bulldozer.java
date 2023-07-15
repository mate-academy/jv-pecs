package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bulldozerId;
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(int bulldozerId, String model) {
        this.bulldozerId = bulldozerId;
        this.model = model;
    }

    public int getBulldozerId() {
        return bulldozerId;
    }

    public void setBulldozerId(int bulldozerId) {
        this.bulldozerId = bulldozerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "bulldozerId=" + bulldozerId
                + ", model='" + model
                + '\'' + '}';
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
