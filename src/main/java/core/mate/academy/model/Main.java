package core.mate.academy.model;

import core.mate.academy.service.BulldozerProducer;
import core.mate.academy.service.ExcavatorProducer;
import core.mate.academy.service.TruckProducer;

public class Main {
    public static void main(String[] args) {
        TruckProducer truckProducer = new TruckProducer();
        truckProducer.get().get(0).doWork();
        BulldozerProducer bulldozerProducer = new BulldozerProducer();
        bulldozerProducer.get().get(0).doWork();
        ExcavatorProducer excavatorProducer = new ExcavatorProducer();
        excavatorProducer.get().get(0).doWork();

    }
}
