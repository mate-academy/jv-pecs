package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements MachineProducer {
    private int tracLength;

    public Excavator() {
    }

    public Excavator(int tracLength) {
        this.tracLength = tracLength;
    }

    public int getTracLength() {
        return tracLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Machine> get() {
        List<Machine> returnValue = new ArrayList<>();
        returnValue.add(new Excavator(30));
        returnValue.add(new Excavator(100));
        returnValue.add(new Excavator());
        return returnValue;
    }
}
