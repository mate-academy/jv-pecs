package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private static final Truck FIRST_TRUCK = new Truck("yellow", 1000, "Volvo");
    private static final Truck SECOND_TRUCK = new Truck("black", 900, "Ford");
    private static final Truck THIRD_TRUCK = new Truck("white", 1100, "NISSAN");

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(FIRST_TRUCK);
        trucks.add(SECOND_TRUCK);
        trucks.add(THIRD_TRUCK);
        return trucks;
    }
}
