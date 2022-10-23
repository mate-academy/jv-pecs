package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean caterpillarTrack;
    private boolean hydroDrive;
    private int diggingDepth;

    public Excavator() {
    }

    public Excavator(boolean caterpillarTrack, boolean hydroDrive, int diggingDepth) {
        this.caterpillarTrack = caterpillarTrack;
        this.hydroDrive = hydroDrive;
        this.diggingDepth = diggingDepth;
    }

    public boolean isCaterpillarTrack() {
        return caterpillarTrack;
    }

    public void setCaterpillarTrack(boolean caterpillarTrack) {
        this.caterpillarTrack = caterpillarTrack;
    }

    public boolean isHydroDrive() {
        return hydroDrive;
    }

    public void setHydroDrive(boolean hydroDrive) {
        this.hydroDrive = hydroDrive;
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
