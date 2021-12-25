package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeSquare;
    private int track;

    public Bulldozer(int bladeSquare, int track, String name, String color) {
        super(name, color);
        this.bladeSquare = bladeSquare;
        this.track = track;
    }

    public Bulldozer() {
    }

    public void setBladeSquare(int bladeSquare) {
        this.bladeSquare = bladeSquare;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public int getBladeSquare() {
        return bladeSquare;
    }

    public int getTrack() {
        return track;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
