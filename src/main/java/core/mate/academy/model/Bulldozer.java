package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class Bulldozer extends Machine implements MachineProducer {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Object> get() {
        return null;
    }
}
