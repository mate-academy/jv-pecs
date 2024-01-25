package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements MachineProducer<Bulldozer> {
    private int enginePower;

    public Bulldozer() {
    }

    public Bulldozer(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(90));
        bulldozers.add(new Bulldozer(100));
        return bulldozers;
    }
}
