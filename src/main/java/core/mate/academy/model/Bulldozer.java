package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerCustom1;
    private String bulldozerCustom2;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBulldozerCustom1() {
        return bulldozerCustom1;
    }

    public void setBulldozerCustom1(String bulldozerCustom1) {
        this.bulldozerCustom1 = bulldozerCustom1;
    }

    public String getBulldozerCustom2() {
        return bulldozerCustom2;
    }

    public void setBulldozerCustom2(String bulldozerCustom2) {
        this.bulldozerCustom2 = bulldozerCustom2;
    }
}
