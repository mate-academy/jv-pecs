package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String ladle;

    public Bulldozer() {
    }

    public Bulldozer(String ladle) {
        this.ladle = ladle;
    }

    public String getLadle() {
        return ladle;
    }

    public void setLadle(String ladle) {
        this.ladle = ladle;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
