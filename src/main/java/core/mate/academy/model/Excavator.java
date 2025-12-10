package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeOfMovingPart;
    private String tool;
    private int scoopPower;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getTypeOfMovingPart() {
        return typeOfMovingPart;
    }

    public void setTypeOfMovingPart(String typeOfMovingPart) {
        this.typeOfMovingPart = typeOfMovingPart;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public int getScoopPower() {
        return scoopPower;
    }

    public void setScoopPower(int scoopPower) {
        this.scoopPower = scoopPower;
    }
}
