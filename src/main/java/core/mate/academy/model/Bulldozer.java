package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String blade;
    private String ripper;

    public Bulldozer() {
    }

    public String getBlade() {
        return blade;
    }

    public void setBlade(String blade) {
        this.blade = blade;
    }

    public String getRipper() {
        return ripper;
    }

    public void setRipper(String ripper) {
        this.ripper = ripper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
