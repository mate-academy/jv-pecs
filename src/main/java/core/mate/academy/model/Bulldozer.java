package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int releaseYear;
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(int releaseYear, String model) {
        this.releaseYear = releaseYear;
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
