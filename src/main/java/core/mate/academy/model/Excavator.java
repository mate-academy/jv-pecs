package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String undercarriage;
    
    public Excavator() {
    }
    
    public Excavator(String name, String color, String undercarriage) {
        super(name, color);
        this.undercarriage = undercarriage;
    }
    
    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
    
    public String getUndercarriage() {
        return undercarriage;
    }
    
    public void setUndercarriage(String undercarriage) {
        this.undercarriage = undercarriage;
    }
}
