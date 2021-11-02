package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String blade;
    private boolean ripper;

    public Bulldozer(String blade, boolean ripper, String name, String color) {
        super(name, color);
        this.blade = blade;
        this.ripper = ripper;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
