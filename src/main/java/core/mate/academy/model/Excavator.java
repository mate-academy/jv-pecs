package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeExcavator;
    private Integer weightExcavator;

    public Excavator(String typeExcavator, Integer weightExcavator) {
        this.typeExcavator = typeExcavator;
        this.weightExcavator = weightExcavator;
    }

    public Excavator() {
    }

    public String getTypeExcavator() {
        return typeExcavator;
    }

    public void setTypeExcavator(String typeExcavator) {
        this.typeExcavator = typeExcavator;
    }

    public Integer getWeightExcavator() {
        return weightExcavator;
    }

    public void setWeightExcavator(Integer weightExcavator) {
        this.weightExcavator = weightExcavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
