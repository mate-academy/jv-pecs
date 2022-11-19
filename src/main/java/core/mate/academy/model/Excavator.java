package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int numberOfHorsepower;

    public Excavator() {

    }

    public Excavator(String name, String color, int numberOfHorsepower) {
        setName(name);
        setColor(color);
        this.numberOfHorsepower = numberOfHorsepower;
    }

    public int getNumberOfHorsepower() {
        return numberOfHorsepower;
    }

    public void setNumberOfHorsepower(int numberOfHorsepower) {
        this.numberOfHorsepower = numberOfHorsepower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
