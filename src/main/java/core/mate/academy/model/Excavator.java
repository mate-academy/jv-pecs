package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String deptMax;
    private String chinesForces;

    public Excavator() {
    }

    public Excavator(String color, String name, String deptMax, String chinesForces) {
        this.deptMax = deptMax;
        this.chinesForces = chinesForces;
        setName(name);
        setColor(color);
    }

    public String getTractionClass() {
        return deptMax;
    }

    public String getGroundPressure() {
        return chinesForces;
    }

    public void setTractionClass(String deptMax) {
        this.deptMax = deptMax;
    }

    public void setGroundPressure(String chinesForces) {
        this.chinesForces = chinesForces;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
