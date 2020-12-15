package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private int idNumber;

    public Bulldozer(String model, int idNumber) {
        this.model = model;
        this.idNumber = idNumber;
    }

    public Bulldozer() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getModel() {
        return model;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
