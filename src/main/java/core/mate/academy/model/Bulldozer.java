package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int sizeOfTrack;
    private int bucketLength;

    public Bulldozer() {
    }

    public Bulldozer(int sizeOfTrack, int bucketLength) {
        this.bucketLength = bucketLength;
        this.sizeOfTrack = sizeOfTrack;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
