package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bumperSize;

    public Bulldozer(String bumperSize, String name, String color) {
        super(name, color);
        this.bumperSize = bumperSize;
    }

    public Bulldozer() {
    }

    public void setBumperSize(String bumperSize) {
        this.bumperSize = bumperSize;
    }

    public String getBumperSize() {
        return bumperSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
