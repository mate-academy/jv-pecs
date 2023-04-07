package core.mate.academy.model;

public class Truck extends Machine {
    private String typeExcavator;
    private Integer sizeExcavator;

    public Truck(String typeExcavator, Integer sizeExcavator) {
        this.typeExcavator = typeExcavator;
        this.sizeExcavator = sizeExcavator;
    }

    public Truck() {
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
        System.out.println("Truck started to work");
    }
}
