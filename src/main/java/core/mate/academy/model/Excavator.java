package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int ladleCount;
    private String vehicleChassisType;

    public Excavator() {
    }

    public Excavator(String name, String color, int ladleCount, String vehicleChassisType) {
        this.setName(name);
        this.setColor(color);
        this.ladleCount = ladleCount;
        this.vehicleChassisType = vehicleChassisType;
    }

    public int getLadleCount() {
        return ladleCount;
    }

    public void setLadleCount(int ladleCount) {
        this.ladleCount = ladleCount;
    }

    public String getVehicleChassisType() {
        return vehicleChassisType;
    }

    public void setVehicleChassisType(String vehicleChassisType) {
        this.vehicleChassisType = vehicleChassisType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{" +
                "Name= " + this.getName()
                + ", color= " + this.getColor()
                + ", ladleCount= " + ladleCount
                + ", vehicleChassisType='" + vehicleChassisType + '\''
                + '}';
    }
}
