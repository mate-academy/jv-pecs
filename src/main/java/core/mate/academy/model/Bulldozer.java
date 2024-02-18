package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String ripper;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String ripper) {
        super(name, color);
        this.ripper = ripper;
    }

    public String getRipper() {
        return ripper;
    }

    public void setRipper(String ripper) {
        this.ripper = ripper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
