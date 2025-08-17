package core.mate.academy.model;

public class Excavator extends Machine {
    private double buckedVolume;
    private double liftingHeihgt;
    private String companyOwner;

    public Excavator() {
    }

    public Excavator(String name, String color, double buckedVolume, double liftingHeihgt,
                     String companyOwner) {
        super(name, color);
        this.buckedVolume = buckedVolume;
        this.liftingHeihgt = liftingHeihgt;
        this.companyOwner = companyOwner;
    }

    public double getBuckedVolume() {
        return buckedVolume;
    }

    public void setBuckedVolume(int buckedVolume) {
        this.buckedVolume = buckedVolume;
    }

    public double getLiftingHeihgt() {
        return liftingHeihgt;
    }

    public void setLiftingHeihgt(int liftingHeihgt) {
        this.liftingHeihgt = liftingHeihgt;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
