package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class Truck extends Machine implements MachineProducer {
    private int amountOfWheels;

    public Truck(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Machine> getListMachines() {
        return List.of(new Truck(8),
                new Truck(6));
    }
}
