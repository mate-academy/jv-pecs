package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int power;
    private String model;

    public Bulldozer(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public Bulldozer() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
