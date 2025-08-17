package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerModel;
    private int bulldozerYear;

    public Bulldozer(String model, int year) {
        this.bulldozerModel = model;
        this.bulldozerYear = year;
    }

    public Bulldozer() {
    }

    public String getBulldozerModel() {
        return bulldozerModel;
    }

    public void setBulldozerModel(String model) {
        this.bulldozerModel = model;
    }

    public int getBulldozerYear() {
        return bulldozerYear;
    }

    public void setBulldozerYear(int year) {
        this.bulldozerYear = year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started do work");
    }
}
