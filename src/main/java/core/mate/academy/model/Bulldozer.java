package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldozerId;
    private String bulldozerName;

    public Bulldozer() {
    }

    public int getId() {
        return bulldozerId;
    }

    public void setId(int id) {
        this.bulldozerId = id;
    }

    @Override
    public String getName() {
        return bulldozerName;
    }

    @Override
    public void setName(String name) {
        this.bulldozerName = name;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
