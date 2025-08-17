package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean dieselMotor;
    private boolean pneumaticDrive;
    private int wheelAxleNumber;

    public Truck() {
    }

    public Truck(boolean dieselMotor, boolean pneumaticDrive, int wheelAxleNumber) {
        this.dieselMotor = dieselMotor;
        this.pneumaticDrive = pneumaticDrive;
        this.wheelAxleNumber = wheelAxleNumber;
    }

    public boolean isDieselMotor() {
        return dieselMotor;
    }

    public void setDieselMotor(boolean dieselMotor) {
        this.dieselMotor = dieselMotor;
    }

    public boolean isPneumaticDrive() {
        return pneumaticDrive;
    }

    public void setPneumaticDrive(boolean pneumaticDrive) {
        this.pneumaticDrive = pneumaticDrive;
    }

    public int getWheelAxleNumber() {
        return wheelAxleNumber;
    }

    public void setWheelAxleNumber(int wheelAxleNumber) {
        this.wheelAxleNumber = wheelAxleNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
