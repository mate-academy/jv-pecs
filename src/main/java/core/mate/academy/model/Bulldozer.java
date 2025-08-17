package core.mate.academy.model;

public class Bulldozer extends Machine {

    private String tracksType;
    private double bladeWidth;
    private double directDumpVolume;

    public Bulldozer(String name, String color, String tracksType, double bladeWidth,
                     double directDumpVolume) {
        super(name, color);
        this.tracksType = tracksType;
        this.bladeWidth = bladeWidth;
        this.directDumpVolume = directDumpVolume;
    }

    public Bulldozer() {
    }

    public void setTracksType(String tracksType) {
        this.tracksType = tracksType;
    }

    public String getTracksType() {
        return tracksType;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setDirectDumpVolume(double directDumpVolume) {
        this.directDumpVolume = directDumpVolume;
    }

    public double getDirectDumpVolume() {
        return directDumpVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
