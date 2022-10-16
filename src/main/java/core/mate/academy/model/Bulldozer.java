package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String blade;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String blade) {
        super(name, color);
        this.blade = blade;
    }

    public String getBlade() {
        return blade;
    }

    public void setBlade(String blade) {
        this.blade = blade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
