package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String color;
    private String model;

    public Bulldozer() {

    }

    public Bulldozer(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
