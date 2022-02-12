package core.mate.academy.model;

public class Excavator extends Machine {
    private String undercarriageType;

    public Excavator() {

    }

    public void setUndercarriageType(String undercarriageType) {
        this.undercarriageType = undercarriageType;
    }

    public String getUndercarriageType() {
        return undercarriageType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
