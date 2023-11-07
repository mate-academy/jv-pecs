package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String ripper;
    private double bladeSize;
    private String engine;

    public Bulldozer() {
    }

    public Bulldozer(String ripper, double bladeSize, String engine) {
        this.ripper = ripper;
        this.bladeSize = bladeSize;
        this.engine = engine;
    }

    public String getRipper() {
        return ripper;
    }

    public void setRipper(String ripper) {
        this.ripper = ripper;
    }

    public double getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(double bladeSize) {
        this.bladeSize = bladeSize;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "ripper='" + ripper + '\''
                + ", bladeSize=" + bladeSize
                + ", engine='" + engine + '\'' + '}';
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
