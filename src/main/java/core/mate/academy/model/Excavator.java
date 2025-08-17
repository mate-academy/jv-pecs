package core.mate.academy.model;

public class Excavator extends Machine {
    private String excavatorModel;
    private int bucketExcavatorCapacity;

    public Excavator() {
    }

    public String getExcavatorModel() {
        return excavatorModel;
    }

    public void setExcavatorModel(String excavatorModel) {
        this.excavatorModel = excavatorModel;
    }

    public int getBucketExcavatorCapacity() {
        return bucketExcavatorCapacity;
    }

    public void setBucketExcavatorCapacity(int bucketExcavatorCapacity) {
        this.bucketExcavatorCapacity = bucketExcavatorCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
