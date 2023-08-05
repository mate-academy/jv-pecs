package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int heightVelocity;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int heightVelocity) {
        this.setName(name);
        this.setColor(color);
        this.heightVelocity = heightVelocity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getHeightVelocity() {
        return heightVelocity;
    }
}
