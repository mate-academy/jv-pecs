package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String boomType;
    private int armLength;
    private int diggingDepth;

    public Excavator() {
    }

    public Excavator(String boomType, int armLength, int diggingDepth) {
        this.boomType = boomType;
        this.armLength = armLength;
        this.diggingDepth = diggingDepth;
    }

    public String getBoomType() {
        return boomType;
    }

    public void setBoomType(String boomType) {
        this.boomType = boomType;
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
