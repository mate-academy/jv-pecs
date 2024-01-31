package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String weight;
    private double heightOfDump;
    private double widthOfDump;

    public Bulldozer(String name, String color, String weight,
                     double heightOfDump, double widthOfDump) {
        super(name, color);
        this.weight = weight;
        this.heightOfDump = heightOfDump;
        this.widthOfDump = widthOfDump;
    }

    public Bulldozer() {
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getHeightOfDump() {
        return heightOfDump;
    }

    public void setHeightOfDump(int heightOfDump) {
        this.heightOfDump = heightOfDump;
    }

    public double getWidthOfDump() {
        return widthOfDump;
    }

    public void setWidthOfDump(int widthOfDump) {
        this.widthOfDump = widthOfDump;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
