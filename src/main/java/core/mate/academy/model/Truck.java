package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine implements Workable {
    private String fieldTruck1;
    private String fieldTruck2;
    private int fieldTruck3;

    public Truck() {
    }

    public Truck(String name, String color, String fieldTruck1,
                 String fieldTruck2, int fieldTruck3) {

        this.fieldTruck1 = fieldTruck1;
        this.fieldTruck2 = fieldTruck2;
        this.fieldTruck3 = fieldTruck3;
    }

    public String getFieldTruck1() {
        return fieldTruck1;
    }

    public void setFieldTruck1(String fieldTruck1) {
        this.fieldTruck1 = fieldTruck1;
    }

    public String getFieldTruck2() {
        return fieldTruck2;
    }

    public void setFieldTruck2(String fieldTruck2) {
        this.fieldTruck2 = fieldTruck2;
    }

    public int getFieldTruck3() {
        return fieldTruck3;
    }

    public void setFieldTruck3(int fieldTruck3) {
        this.fieldTruck3 = fieldTruck3;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
