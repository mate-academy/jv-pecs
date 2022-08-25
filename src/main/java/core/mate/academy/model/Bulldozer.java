package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bullInt;
    private String bullStr;
    private boolean bullBool;

    public Bulldozer() {

    }

    public Bulldozer(int bullInt, String bullStr, boolean bullBool) {
        this.bullInt = bullInt;
        this.bullStr = bullStr;
        this.bullBool = bullBool;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
