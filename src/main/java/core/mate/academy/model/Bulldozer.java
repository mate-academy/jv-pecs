package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private String chassisType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int horsePower, String chassisType) {
        setName(name);
        setColor(color);
        this.horsePower = horsePower;
        this.chassisType = chassisType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
