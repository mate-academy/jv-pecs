package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String chassisType;
    private double pullingForce;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String chassisType, double pullingForce) {
        super(name, color);
        this.chassisType = chassisType;
        this.pullingForce = pullingForce;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public double getPullingForce() {
        return pullingForce;
    }

    public void setPullingForce(double pullingForce) {
        this.pullingForce = pullingForce;
    }
}
