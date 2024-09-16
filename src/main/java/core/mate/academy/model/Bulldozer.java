package core.mate.academy.model;

import core.mate.academy.enums.BulldozerVariant;

public class Bulldozer extends Machine {
    private BulldozerVariant variant;

    public Bulldozer() {
    }

    public Bulldozer(BulldozerVariant variant) {
        this.variant = variant;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
