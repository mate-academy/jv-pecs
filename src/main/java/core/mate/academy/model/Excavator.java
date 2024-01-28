package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int bucketRemoval;
    private int weight;
    private String model;

    public Excavator() {
    }

    public Excavator(ExcavatorBuilder excavatorBuilder) {
        this.bucketRemoval = excavatorBuilder.bucketRemoval;
        this.weight = excavatorBuilder.weight;
        this.model = excavatorBuilder.model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public static class ExcavatorBuilder {
        private int bucketRemoval;
        private int weight;
        private String model;

        public ExcavatorBuilder setBucketRemoval(int bucketRemoval) {
            this.bucketRemoval = bucketRemoval;
            return this;
        }

        public ExcavatorBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public ExcavatorBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public Excavator build() {
            return new Excavator(this);
        }
    }
}
