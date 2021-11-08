package core.mate.academy.model;

public class Truck extends Machine {
    private int numberCylinders;
    private double workingVolume;
    private int ratedSpeed;

    public Truck() {
    }

    public Truck(int numberCylinders, double workingVolume, int ratedSpeed,
                 String name, String color) {
        this.numberCylinders = numberCylinders;
        this.workingVolume = workingVolume;
        this.ratedSpeed = ratedSpeed;
        super.setName(name);
        super.setColor(color);
    }

    public int getNumberCylinders() {
        return numberCylinders;
    }

    public double getWorkingVolume() {
        return workingVolume;
    }

    public int getRatedSpeed() {
        return ratedSpeed;
    }

    public void setNumberCylinders(int numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    public void setWorkingVolume(double workingVolume) {
        this.workingVolume = workingVolume;
    }

    public void setRatedSpeed(int ratedSpeed) {
        this.ratedSpeed = ratedSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
