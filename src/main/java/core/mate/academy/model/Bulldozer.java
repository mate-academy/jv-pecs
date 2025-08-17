package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int cargo;
    private int oilCapacity;

    public Bulldozer() {
    }

    public Bulldozer(int cargo, int oilCapacity) {
        this.cargo = cargo;
        this.oilCapacity = oilCapacity;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(int oilCapacity) {
        this.oilCapacity = oilCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
