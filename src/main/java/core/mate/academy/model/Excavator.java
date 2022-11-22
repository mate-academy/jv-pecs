package core.mate.academy.model;

public class Excavator extends Machine {
    private int power;
    private String model;

    public Excavator(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public Excavator() {
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
        System.out.println("Excavator started to work");
    }
}
