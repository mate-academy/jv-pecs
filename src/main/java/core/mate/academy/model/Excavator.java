package core.mate.academy.model;

public class Excavator extends Machine {
    private String excavatorChassisType;
    private String attachments;
    private String excavatorType;

    public Excavator() {
    }

    public String getExcavatorChassisType() {
        return excavatorChassisType;
    }

    public void setExcavatorChassisType(String excavatorChassisType) {
        this.excavatorChassisType = excavatorChassisType;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String getExcavatorType() {
        return excavatorType;
    }

    public void setExcavatorType(String excavatorType) {
        this.excavatorType = excavatorType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
