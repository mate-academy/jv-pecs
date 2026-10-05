package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String engineType;

    public Bulldozer() {
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
