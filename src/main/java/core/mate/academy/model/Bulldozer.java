package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int size;

    public Bulldozer() {
    }

    public Bulldozer(String name, String colour, int size) {
        this.setName(name);
        this.setColor(colour);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
