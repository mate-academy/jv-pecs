package core.mate.academy.model;

import core.mate.academy.service.BulldozerProducer;

public class Bulldozer extends BulldozerProducer {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
