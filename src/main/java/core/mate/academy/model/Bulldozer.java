package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerModel;
    private int bulldozerWeight;

    public Bulldozer() {
    }

    public String getBulldozerModel() {
        return bulldozerModel;
    }

    public void setBulldozerModel(String bulldozerModel) {
        this.bulldozerModel = bulldozerModel;
    }

    public int getBulldozerWeight() {
        return bulldozerWeight;
    }

    public void setBulldozerWeight(int bulldozerWeight) {
        this.bulldozerWeight = bulldozerWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
