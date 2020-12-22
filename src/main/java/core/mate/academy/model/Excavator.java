package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeExcavator;
    private String typeBuckets;
    private String typeFrame;

    public Excavator() {
        super();
    }

    public String getTypeExcavator() {
        return typeExcavator;
    }

    public void setTypeExcavator(String typeExcavator) {
        this.typeExcavator = typeExcavator;
    }

    public String getTypeBuckets() {
        return typeBuckets;
    }

    public void setTypeBuckets(String typeBuckets) {
        this.typeBuckets = typeBuckets;
    }

    public String getTypeFrame() {
        return typeFrame;
    }

    public void setTypeFrame(String typeFrame) {
        this.typeFrame = typeFrame;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
