package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private String typeByWork;

    public Bulldozer() {
    }

    public Bulldozer(String color, String name, String bladeType, String typeByWork) {
        setColor(color);
        setName(name);
        this.bladeType = bladeType;
        this.typeByWork = typeByWork;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
