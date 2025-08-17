package core.mate.academy.model;

public class Excavator extends Machine {
    private int excavatorIntField;
    private String excavatorStrField;

    public Excavator() {
    }
    
    public Excavator(String name, String color, int excavatorIntField, String excavatorStrField) {
        super(name, color);
        this.excavatorIntField = excavatorIntField;
        this.excavatorStrField = excavatorStrField;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getExcavatorIntField() {
        return excavatorIntField;
    }

    public void setExcavatorIntField(int excavatorIntField) {
        this.excavatorIntField = excavatorIntField;
    }

    public String getExcavatorStrField() {
        return excavatorStrField;
    }

    public void setExcavatorStrField(String excavatorStrField) {
        this.excavatorStrField = excavatorStrField;
    }
}
