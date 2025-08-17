package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String chassis;
    private String bladesType;
    private boolean hasRipper;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getBladesType() {
        return bladesType;
    }

    public void setBladesType(String bladesType) {
        this.bladesType = bladesType;
    }

    public boolean isHasRipper() {
        return hasRipper;
    }

    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }
}
