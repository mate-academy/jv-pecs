package core.mate.academy.model;

public class Truck extends Machine {
    private String horsepower;
    private String tireDesign;

    public Truck() {
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getTireDesign() {
        return tireDesign;
    }

    public void setTireDesign(String tireDesign) {
        this.tireDesign = tireDesign;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
