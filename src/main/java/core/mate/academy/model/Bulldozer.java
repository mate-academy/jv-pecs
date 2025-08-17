package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String mark;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String markBulldozer) {
        super(name, color);
        this.mark = markBulldozer;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return super.toString()
                + "markBulldozer='" + mark + "'}";
    }
}
