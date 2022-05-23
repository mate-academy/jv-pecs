package core.mate.academy.model;

public class Excavator extends Machine {
    private int height;
    private String buildCompany;

    public Excavator() {
    }

    public Excavator(String name, String color, int height, String buildCompany) {
        super(name, color);
        this.height = height;
        this.buildCompany = buildCompany;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBuildCompany() {
        return buildCompany;
    }

    public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
