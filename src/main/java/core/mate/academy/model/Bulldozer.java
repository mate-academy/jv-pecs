package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String type;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
