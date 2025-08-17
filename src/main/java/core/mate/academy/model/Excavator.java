package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double sizeBackBucket;
    private double canDeepDig;

    public Excavator() {
    }

    public Excavator(double sizeBackBucket, double canDeepDig) {
        this.sizeBackBucket = sizeBackBucket;
        this.canDeepDig = canDeepDig;
    }

    public double getSizeBackBucket() {
        return sizeBackBucket;
    }

    public void setSizeBackBucket(double sizeBackBucket) {
        this.sizeBackBucket = sizeBackBucket;
    }

    public double getCanDeepDig() {
        return canDeepDig;
    }

    public void setCanDeepDig(double canDeepDig) {
        this.canDeepDig = canDeepDig;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
