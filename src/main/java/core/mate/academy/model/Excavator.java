package core.mate.academy.model;

public class Excavator extends Machine {
    private int excavatorId;
    private String model;

    public Excavator() {
    }

    public Excavator(int excavatorId, String model) {
        this.excavatorId = excavatorId;
        this.model = model;
    }

    public int getExcavatorId() {
        return excavatorId;
    }

    public void setExcavatorId(int excavatorId) {
        this.excavatorId = excavatorId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Excavator{"
                + "excavatorId=" + excavatorId
                + ", model='" + model
                + '\'' + '}';
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
