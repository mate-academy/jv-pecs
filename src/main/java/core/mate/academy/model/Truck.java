package core.mate.academy.model;

public class Truck extends Machine {
    private String carcassType;
    private int carcassSpaciousness;

    public Truck() {
    }

    public String getCarcassType() {
        return carcassType;
    }

    public void setCarcassType(String carcassType) {
        this.carcassType = carcassType;
    }

    public int getCarcassSpaciousness() {
        return carcassSpaciousness;
    }

    public void setCarcassSpaciousness(int carcassSpaciousness) {
        this.carcassSpaciousness = carcassSpaciousness;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
