package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean isCaterpillar;
    private double misstatementWall;
    private int urgeMove;
    private int widthShanks;

    public Bulldozer() {
    }

    public Bulldozer(boolean isCaterpillar, double misstatementWall, int urgeMove,
                     int widthShanks, String name, String color) {
        super(name, color);
        this.isCaterpillar = isCaterpillar;
        this.misstatementWall = misstatementWall;
        this.urgeMove = urgeMove;
        this.widthShanks = widthShanks;
    }

    public boolean isCaterpillar() {
        return isCaterpillar;
    }

    public double getMisstatementWall() {
        return misstatementWall;
    }

    public double getUrgeMove() {
        return urgeMove;
    }

    public double getWidthShanks() {
        return widthShanks;
    }

    public void setCaterpillar(boolean caterpillar) {
        isCaterpillar = caterpillar;
    }

    public void setMisstatementWall(double misstatementWall) {
        this.misstatementWall = misstatementWall;
    }

    public void setUrgeMove(int urgeMove) {
        this.urgeMove = urgeMove;
    }

    public void setWidthShanks(int widthShanks) {
        this.widthShanks = widthShanks;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
