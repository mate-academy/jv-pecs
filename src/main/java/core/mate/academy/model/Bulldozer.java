package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class Bulldozer extends Machine implements MachineProducer {
    private int numberOfTrucks;

    public Bulldozer(int numberOfTrucks) {
        this.numberOfTrucks = numberOfTrucks;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Machine> getListMachines() {
        return List.of(new Bulldozer(2),
                new Bulldozer(4));
    }
}
