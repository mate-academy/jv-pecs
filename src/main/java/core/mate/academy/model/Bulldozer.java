package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String baseOfBulldozer;

    public Bulldozer(String name, String baseOfBulldozer, String color) {
        super(name, color);
        this.baseOfBulldozer = baseOfBulldozer;
    }

    public Bulldozer() {
        super();
    }

    public String getBaseOfBulldozer() {
        return baseOfBulldozer;
    }

    public void setBaseOfBulldozer(String baseOfBulldozer) {
        this.baseOfBulldozer = baseOfBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
