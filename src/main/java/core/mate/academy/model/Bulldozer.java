package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int horsePowers;
    private String type;

    public Bulldozer() {
    }

    public Bulldozer(int horsePowers, String type) {
        this.horsePowers = horsePowers;
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
