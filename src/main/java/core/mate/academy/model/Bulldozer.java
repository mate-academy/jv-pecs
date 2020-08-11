package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends T {
    private boolean isCrawler;
    private String plateType;
    private double maxMassPushed;
    private int price;

    public Bulldozer() {
    }

    public Bulldozer(boolean isCrawler, String plateType, double maxMassPushed, int price) {
        this.isCrawler = isCrawler;
        this.plateType = plateType;
        this.maxMassPushed = maxMassPushed;
        this.price = price;
    }

    public boolean isCrawler() {
        return isCrawler;
    }

    public void setCrawler(boolean crawler) {
        isCrawler = crawler;
    }

    public String getPlateType() {
        return plateType;
    }

    public void setPlateType(String plateType) {
        this.plateType = plateType;
    }

    public double getMaxMassPushed() {
        return maxMassPushed;
    }

    public void setMaxMassPushed(double maxMassPushed) {
        this.maxMassPushed = maxMassPushed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
