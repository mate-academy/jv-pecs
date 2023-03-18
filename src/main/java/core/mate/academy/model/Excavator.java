package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator<T> extends Machine {
    private double contoursOfWorkingEquipment;
    private double strokeContour;
    private double turnContour;

    public Excavator() {
    }

    public Excavator(double contoursOfWorkingEquipment, double strokeContour, double turnContour) {
        this.contoursOfWorkingEquipment = contoursOfWorkingEquipment;
        this.strokeContour = strokeContour;
        this.turnContour = turnContour;
    }

    public double getContoursOfWorkingEquipment() {
        return contoursOfWorkingEquipment;
    }

    public void setContoursOfWorkingEquipment(double contoursOfWorkingEquipment) {
        this.contoursOfWorkingEquipment = contoursOfWorkingEquipment;
    }

    public double getStrokeContour() {
        return strokeContour;
    }

    public void setStrokeContour(double strokeContour) {
        this.strokeContour = strokeContour;
    }

    public double getTurnContour() {
        return turnContour;
    }

    public void setTurnContour(double turnContour) {
        this.turnContour = turnContour;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
