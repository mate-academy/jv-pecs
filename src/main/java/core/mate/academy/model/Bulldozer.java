package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int widthBucket;
    private int year;

    public Bulldozer() {
    }

    public int getWidthBucket() {
        return widthBucket;
    }

    public void setWidthBucket(int widthBucket) {
        this.widthBucket = widthBucket;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
