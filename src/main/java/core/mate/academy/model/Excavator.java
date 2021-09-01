package core.mate.academy.model;

public class Excavator extends Machine {
    private int excavatorYear;

    public Excavator(String name, String color, int excavatorYear) {
        super(name, color);
        this.excavatorYear = excavatorYear;
    }

    public Excavator() {
    }

    public int getExcavatorYear() {
        return excavatorYear;
    }

    public void setExcavatorYear(int excavatorYear) {
        this.excavatorYear = excavatorYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
