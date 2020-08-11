package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String type;
    private int year;

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
