package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String model;
    private int productionYear;

    public Bulldozer() {
    }

    public Bulldozer(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
