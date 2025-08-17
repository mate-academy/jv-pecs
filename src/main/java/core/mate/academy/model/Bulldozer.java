package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine implements Workable {
    private String fieldBulldozer1;
    private String fieldBulldozer2;
    private int fieldBulldozer3;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String fieldBulldozer1,
                     String fieldBulldozer2, int fieldBulldozer3) {
        this.fieldBulldozer1 = fieldBulldozer1;
        this.fieldBulldozer2 = fieldBulldozer2;
        this.fieldBulldozer3 = fieldBulldozer3;
    }

    public String getFieldBulldozer1() {
        return fieldBulldozer1;
    }

    public void setFieldBulldozer1(String fieldBulldozer1) {
        this.fieldBulldozer1 = fieldBulldozer1;
    }

    public String getFieldBulldozer2() {
        return fieldBulldozer2;
    }

    public void setFieldBulldozer2(String fieldBulldozer2) {
        this.fieldBulldozer2 = fieldBulldozer2;
    }

    public int getFieldBulldozer3() {
        return fieldBulldozer3;
    }

    public void setFieldBulldozer3(int fieldBulldozer3) {
        this.fieldBulldozer3 = fieldBulldozer3;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
