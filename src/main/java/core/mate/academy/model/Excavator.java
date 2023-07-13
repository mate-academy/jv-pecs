package core.mate.academy.model;

public class Excavator extends Machine {
    private int weight;
    private int year;

    public Excavator() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
