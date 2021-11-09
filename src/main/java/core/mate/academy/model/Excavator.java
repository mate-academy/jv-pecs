package core.mate.academy.model;

public class Excavator extends Machine {
    private double volumeBucket;
    private boolean hotFilter;
    private boolean coldFilter;

    public Excavator() {
    }

    public Excavator(double volumeBucket, boolean hotFilter, boolean coldFilter,
                     String name, String color) {
        super(name, color);
        this.volumeBucket = volumeBucket;
        this.hotFilter = hotFilter;
        this.coldFilter = coldFilter;
    }

    public double getVolumeBucket() {
        return volumeBucket;
    }

    public boolean isHotFilter() {
        return hotFilter;
    }

    public boolean isColdFilter() {
        return coldFilter;
    }

    public void setVolumeBucket(double volumeBucket) {
        this.volumeBucket = volumeBucket;
    }

    public void setHotFilter(boolean hotFilter) {
        this.hotFilter = hotFilter;
    }

    public void setColdFilter(boolean coldFilter) {
        this.coldFilter = coldFilter;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
