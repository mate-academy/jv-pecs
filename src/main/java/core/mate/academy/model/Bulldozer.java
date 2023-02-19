package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String model;
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color,String model, int power) {
        super(name, color);
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

}
