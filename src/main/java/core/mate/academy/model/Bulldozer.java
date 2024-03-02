package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements MachineProducer<Machine> {

    public Bulldozer() {
    }

    @Override
    public List<Machine> get() {
        List<Machine> bulldozer = new ArrayList<>();
        bulldozer.add(new Bulldozer());
        return bulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
