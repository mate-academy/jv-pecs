package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String model;
    private int year;

    public Bulldozer() {
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
