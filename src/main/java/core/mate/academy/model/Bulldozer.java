package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maxDepthOfDump;
    private int maxLiftingHeightOfDump;

    public Bulldozer() {
    }

    public int getMaxDepthOfDump() {
        return maxDepthOfDump;
    }

    public void setMaxDepthOfDump(int maxDepthOfDump) {
        this.maxDepthOfDump = maxDepthOfDump;
    }

    public int getMaxLiftingHeightOfDump() {
        return maxLiftingHeightOfDump;
    }

    public void setMaxLiftingHeightOfDump(int maxLiftingHeightOfDump) {
        this.maxLiftingHeightOfDump = maxLiftingHeightOfDump;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

