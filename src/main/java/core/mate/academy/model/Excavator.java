package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfOil;

    public Excavator() {
    }

    public String getTypeOfOil() {
        return typeOfOil;
    }

    public void setTypeOfOil(String typeOfOil) {
        this.typeOfOil = typeOfOil;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public Excavator clone() throws CloneNotSupportedException {
        return (Excavator) super.clone();
    }
}
