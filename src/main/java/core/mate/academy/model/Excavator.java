package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeOfExcavator;
    private int numberOfPumps;

    public Excavator() {
    }

    public Excavator(String name, String color, String typeOfExcavator, int numberOfPumps) {
        this.typeOfExcavator = typeOfExcavator;
        this.numberOfPumps = numberOfPumps;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getTypeOfExcavator() {
        return typeOfExcavator;
    }

    public void setTypeOfExcavator(String typeOfExcavator) {
        this.typeOfExcavator = typeOfExcavator;
    }

    public int getNumberOfPumps() {
        return numberOfPumps;
    }

    public void setNumberOfPumps(int numberOfPumps) {
        this.numberOfPumps = numberOfPumps;
    }
}
