package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String ladle;
    private String caterpillar;

    public Bulldozer() {
    }

    public String getLadle() {
        return ladle;
    }

    public void setLadle(String ladle) {
        this.ladle = ladle;
    }

    public String getCaterpillar() {
        return caterpillar;
    }

    public void setCaterpillar(String caterpillar) {
        this.caterpillar = caterpillar;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
