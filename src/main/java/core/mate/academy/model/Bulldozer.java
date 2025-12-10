package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String ripperType;
    private String wedgeType;
    private int scoopPower;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getRipperType() {
        return ripperType;
    }

    public void setRipperType(String ripperType) {
        this.ripperType = ripperType;
    }

    public String getWedgeType() {
        return wedgeType;
    }

    public void setWedgeType(String wedgeType) {
        this.wedgeType = wedgeType;
    }

    public int getScoopPower() {
        return scoopPower;
    }

    public void setScoopPower(int scoopPower) {
        this.scoopPower = scoopPower;
    }
}
