package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String size;
    private String type;

    public Bulldozer() {
    }

    public Bulldozer(String size, String type) {
        size = size;
        type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
