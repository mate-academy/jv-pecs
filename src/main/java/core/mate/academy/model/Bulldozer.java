package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bulldozerIntField;
    private String bulldozerStrField;
    
    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bulldozerIntField, String bulldozerStrField) {
        super(name, color);
        this.bulldozerIntField = bulldozerIntField;
        this.bulldozerStrField = bulldozerStrField;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getBulldozerIntField() {
        return bulldozerIntField;
    }

    public void setBulldozerIntField(int bulldozerIntField) {
        this.bulldozerIntField = bulldozerIntField;
    }

    public String getBulldozerStrField() {
        return bulldozerStrField;
    }

    public void setBulldozerStrField(String bulldozerStrField) {
        this.bulldozerStrField = bulldozerStrField;
    }
}
