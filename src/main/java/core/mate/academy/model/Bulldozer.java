package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int lengthBlade;
    private int horsePower;

    public Bulldozer(int lengthBlade, int horsePower) {
        this.lengthBlade = lengthBlade;
        this.horsePower = horsePower;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
