package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private String bulldozerModel;

    public Bulldozer(String name, String color, int horsePower, String bulldozerModel) {
        super(name, color);
        this.horsePower = horsePower;
        this.bulldozerModel = bulldozerModel;
    }

    public Bulldozer() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBulldozerModel() {
        return bulldozerModel;
    }

    public void setBulldozerModel(String bulldozerModel) {
        this.bulldozerModel = bulldozerModel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
