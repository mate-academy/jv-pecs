package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String caterpillarModel;
    private int bucketWidth;

    public Bulldozer() {
    }

    public void setCaterpillarModel(String caterpillarModel) {
        this.caterpillarModel = caterpillarModel;
    }

    public void setBucketWidth(int bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

