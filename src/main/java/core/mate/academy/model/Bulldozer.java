package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private int enginePower;
    private double weight;
    private int bladeCapacity;

    public Bulldozer() {
    }

    private Bulldozer(BulldozerBuilder bulldozerBuilder) {
        enginePower = bulldozerBuilder.enginePower;
        weight = bulldozerBuilder.weight;
        bladeCapacity = bulldozerBuilder.bladeCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public static class BulldozerBuilder {
        private int enginePower;
        private double weight;
        private int bladeCapacity;

        public BulldozerBuilder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public BulldozerBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public BulldozerBuilder setBladeCapacity(int bladeCapacity) {
            this.bladeCapacity = bladeCapacity;
            return this;
        }

        public Bulldozer build() {
            return new Bulldozer(this);
        }
    }
}
