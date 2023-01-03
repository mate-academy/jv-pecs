package core.mate.academy.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final ModelSupplier modelSupplier = new ModelSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(modelSupplier.getRandomModel(), colorSupplier.getRandomColor()));
        truckList.add(new Truck(modelSupplier.getRandomModel(), colorSupplier.getRandomColor()));
        truckList.add(new Truck(modelSupplier.getRandomModel(), colorSupplier.getRandomColor()));
        return truckList;
    }
}
