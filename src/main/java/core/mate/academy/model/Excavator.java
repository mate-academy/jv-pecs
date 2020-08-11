package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String undercarriageType;
    private String mark;

    public Excavator() {
    }

    public Excavator(String undercarriageType, String mark) {
        this.undercarriageType = undercarriageType;
        this.mark = mark;
    }

    public String getUndercarriageType() {
        return undercarriageType;
    }

    public void setUndercarriageType(String undercarriageType) {
        this.undercarriageType = undercarriageType;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
