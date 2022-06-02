package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String maker;
    private String model;
    private int year;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String maker, String model, int year) {
        super(name, color);
        this.maker = maker;
        this.model = model;
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
