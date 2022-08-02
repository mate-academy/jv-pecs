package core.mate.academy.model;

public class Excavator extends Machine {
    int bucket_volume;
    int weight;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBucket_volume() {
        return bucket_volume;
    }

    public void setBucket_volume(int bucket_volume) {
        this.bucket_volume = bucket_volume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
