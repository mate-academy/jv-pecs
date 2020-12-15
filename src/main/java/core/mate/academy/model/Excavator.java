package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String type;
    private String appointment;

    public Excavator() {
    }

    public Excavator(String name, String color, String type, String appointment) {
        setName(name);
        setColor(color);
        this.type = type;
        this.appointment = appointment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
