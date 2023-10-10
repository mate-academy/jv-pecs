package core.mate.academy.impl;

import static core.mate.academy.MachineSupplier.DEFAULT_AMOUNT_OF_MACHINE_TO_CREATE;

import core.mate.academy.MachineSupplier;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final MachineSupplier machineSupplier = new MachineSupplier();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < DEFAULT_AMOUNT_OF_MACHINE_TO_CREATE; i++) {
            trucks.add(machineSupplier.getDefaultTruck());
        }
        return trucks;
    }
}
