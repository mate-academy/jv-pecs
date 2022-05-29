package core.mate.academy.model;

public class Truck extends Machine {
    private boolean hasIdler;
    private String axlesConfiguration;
    private int ecoStandard;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public boolean isHasIdler() {
        return hasIdler;
    }

    public void setHasIdler(boolean hasIdler) {
        this.hasIdler = hasIdler;
    }

    public String getAxlesConfiguration() {
        return axlesConfiguration;
    }

    public void setAxlesConfiguration(String axlesConfiguration) {
        this.axlesConfiguration = axlesConfiguration;
    }

    public int getEcoStandard() {
        return ecoStandard;
    }

    public void setEcoStandard(int ecoStandard) {
        this.ecoStandard = ecoStandard;
    }
}
