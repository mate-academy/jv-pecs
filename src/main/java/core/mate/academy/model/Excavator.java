package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class Excavator extends Machine implements MachineProducer {
    private int numberOfTrailer;

    public Excavator(int numberOfTrailer) {
        this.numberOfTrailer = numberOfTrailer;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {

        System.out.println("Excavator started to work");
    }

    @Override
    public List<Machine> getListMachines() {
        return List.of(new Excavator(4),
                new Excavator(2),
                new Excavator(6));
    }
}
