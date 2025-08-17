package core.mate.academy.model;

public class Excavator extends Machine {
    private String excavatorModel;
    private int excavatorYear;

    public Excavator(String model, int year) {
        this.excavatorModel = model;
        this.excavatorYear = year;
    }

    public Excavator() {
    }

    public String getExcavatorModel() {
        return excavatorModel;
    }

    public void setExcavatorModel(String model) {
        this.excavatorModel = model;
    }

    public int getExcavatorYear() {
        return excavatorYear;
    }

    public void setExcavatorYear(int year) {
        this.excavatorYear = year;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started do work");
    }
}
