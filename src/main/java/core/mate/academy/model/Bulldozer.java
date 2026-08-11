package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String blade;
    private int tracks;

    public Bulldozer() {
    }

    public Bulldozer(String blade, int tracks) {
        this.blade = blade;
        this.tracks = tracks;
    }

    public String getBlade() {
        return blade;
    }

    public void setBlade(String blade) {
        this.blade = blade;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
