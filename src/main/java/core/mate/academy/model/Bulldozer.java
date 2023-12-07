package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements MachineProducer<Bulldozer> {

    public Bulldozer() {
    }

    public Bulldozer(String serialNumber, int power) {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("first", 1));
        bulldozers.add(new Bulldozer("second", 2));
        return bulldozers;
    }
}
