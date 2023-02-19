package core.mate.academy.model;

public class Excavator extends Machine {
    private String originCountry;
    private int weight;

    public Excavator() {
    }

    public Excavator(String name, String color,String originCountry, int weight) {
        super(name, color);
        this.originCountry = originCountry;
        this.weight = weight;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
