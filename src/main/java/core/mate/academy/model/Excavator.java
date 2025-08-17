package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine implements Workable {
    private String fieldExcavator1;
    private String fieldExcavator2;
    private int fieldExcavator3;

    public Excavator() {
    }

    public Excavator(String name, String color, String fieldExcavator1,
                     String fieldExcavator2, int fieldExcavator3) {
        this.fieldExcavator1 = fieldExcavator1;
        this.fieldExcavator2 = fieldExcavator2;
        this.fieldExcavator3 = fieldExcavator3;
    }

    public String getFieldExcavator1() {
        return fieldExcavator1;
    }

    public void setFieldExcavator1(String fieldExcavator1) {
        this.fieldExcavator1 = fieldExcavator1;
    }

    public String getFieldExcavator2() {
        return fieldExcavator2;
    }

    public void setFieldExcavator2(String fieldExcavator2) {
        this.fieldExcavator2 = fieldExcavator2;
    }

    public int getFieldExcavator3() {
        return fieldExcavator3;
    }

    public void setFieldExcavator3(int fieldExcavator3) {
        this.fieldExcavator3 = fieldExcavator3;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
