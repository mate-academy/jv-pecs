package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerBladeType;
    private String bulldozerEnginePower;

    public Bulldozer() {
    }

    public Bulldozer(String bulldozerBladeType) {
        this.bulldozerBladeType = bulldozerBladeType;
    }

    public String getBulldozerBladeType() {
        return bulldozerBladeType;
    }

    public void setBulldozerBladeType(String bulldozerBladeType) {
        this.bulldozerBladeType = bulldozerBladeType;
    }

    public String getBulldozerEnginePower() {
        return bulldozerEnginePower;
    }

    public void setBulldozerEnginePower(String bulldozerEnginePower) {
        this.bulldozerEnginePower = bulldozerEnginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
