package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int size;
    private String model;

    public Excavator() {
    }

    public Excavator(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Excavator excavator = (Excavator) o;

        if (size != excavator.size) {
            return false;
        }
        return model.equals(excavator.model);
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + model.hashCode();
        return result;
    }
}
