package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maxPowerHp;
    private String sizeBsl;

    public Bulldozer(int maxPowerHp, String sizeBsl) {
        this.maxPowerHp = maxPowerHp;
        this.sizeBsl = sizeBsl;
    }

    public Bulldozer() {
    }

    public int getMaxPowerHp() {
        return maxPowerHp;
    }

    public void setMaxPowerHp(int maxPowerHp) {
        this.maxPowerHp = maxPowerHp;
    }

    public String getSizeBsl() {
        return sizeBsl;
    }

    public void setSizeBsl(String sizeBsl) {
        this.sizeBsl = sizeBsl;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
