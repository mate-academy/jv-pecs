package core.mate.academy.model;

public class Excavator extends Machine {
    private int boomLength;

    public Excavator(String name, String color, int excavatorYear) {
        super(name, color);
        this.boomLength = excavatorYear;
    }

    public Excavator() {
    }

    public int getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(int boomLength) {
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
