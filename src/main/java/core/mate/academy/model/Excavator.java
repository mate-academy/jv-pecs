package core.mate.academy.model;

public class Excavator extends Machine {
    private double volume;
    private int scoopsNumber;

    public Excavator() {
    }

    public Excavator(String name, String color, double volume, int scoopsNumber) {
        setName(name);
        setColor(color);
        this.volume = volume;
        this.scoopsNumber = scoopsNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getScoopsNumber() {
        return scoopsNumber;
    }

    public void setScoopsNumber(int scoopNumber) {
        this.scoopsNumber = scoopNumber;
    }
}
