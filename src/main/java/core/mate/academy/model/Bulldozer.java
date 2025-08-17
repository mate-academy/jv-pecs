package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String madeIn;
    private int year;
    private String engineModel;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getMadeIn() {
        return madeIn;
    }

    public int getYear() {
        return year;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }
}
