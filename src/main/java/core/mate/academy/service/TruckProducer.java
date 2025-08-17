package core.mate.academy.service;

import core.mate.academy.model.Truck;
import core.mate.academy.suppliers.MachineSupplier;
import core.mate.academy.suppliers.NumberSupplier;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MIN_TRUCK_AMOUNT = 1;
    private static final int MAX_TRUCK_AMOUNT = 10;
    private MachineSupplier machineSupplier = new MachineSupplier();
    private NumberSupplier numberSupplier = new NumberSupplier();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        int bulldozerAmount = numberSupplier.getRandomIntNumber(MIN_TRUCK_AMOUNT, MAX_TRUCK_AMOUNT);
        for (int i = 0; i < bulldozerAmount; i++) {
            trucks.add(machineSupplier.getRandomTruck());
        }
        return trucks;
    }
}
