package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck truck = new Truck();
        truck.setNumber(new Random().nextInt(100));
        truck.setTrailer(new Random().nextBoolean());
        trucks.add(truck);
        trucks.add(truck);
        trucks.add(truck);
        return trucks;
    }
}
