package core.mate.academy.model;

public class Excavator extends Machine {
    private int powerHorse;
    private String label;

    public Excavator() {

    }

    public Excavator(int powerHorse, String label) {
        this.powerHorse = powerHorse;
        this.label = label;
    }

    public int getPowerHorse() {
        return powerHorse;
    }

    public String getLabel() {
        return label;
    }

    public void setPowerHorse(int powerHorse) {
        this.powerHorse = powerHorse;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
