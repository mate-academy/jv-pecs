package core.mate.academy.model;

public class Excavator extends Machine {
    private int depth;
    private int sizeOfScoop;
    private String modelOfExcavator;

    public Excavator() {
    }

    public Excavator(int depth, int sizeOfScoop, String modelOfExcavator) {
        this.depth = depth;
        this.sizeOfScoop = sizeOfScoop;
        this.modelOfExcavator = modelOfExcavator;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getSizeOfScoop() {
        return sizeOfScoop;
    }

    public void setSizeOfScoop(int sizeOfScoop) {
        this.sizeOfScoop = sizeOfScoop;
    }

    public String getModelOfExcavator() {
        return modelOfExcavator;
    }

    public void setModelOfExcavator(String modelOfExcavator) {
        this.modelOfExcavator = modelOfExcavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
