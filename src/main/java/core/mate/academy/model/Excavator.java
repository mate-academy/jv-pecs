package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeExcavator;
    private Integer sizeExcavator;

    public Excavator(String typeExcavator, Integer sizeExcavator) {
        this.typeExcavator = typeExcavator;
        this.sizeExcavator = sizeExcavator;
    }

    public Excavator() {
    }

    public String getTypeExcavator() {
        return typeExcavator;
    }

    public void setTypeExcavator(String typeExcavator) {
        this.typeExcavator = typeExcavator;
    }

    public Integer getSizeExcavator() {
        return sizeExcavator;
    }

    public void setSizeExcavator(Integer sizeExcavator) {
        this.sizeExcavator = sizeExcavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
