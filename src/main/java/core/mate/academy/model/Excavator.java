package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorId;
    private String excavatorName;

    public Excavator() {
    }

    public int getId() {
        return excavatorId;
    }

    public void setId(int id) {
        this.excavatorId = id;
    }

    @Override
    public String getName() {
        return excavatorName;
    }

    @Override
    public void setName(String name) {
        this.excavatorName = name;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
