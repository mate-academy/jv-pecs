package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        truck.putItemToStorage(new Truck());
        truck.putItemToStorage(new Truck());
        truck.putItemToStorage(new Truck());
        truck.putItemToStorage(new Truck());
        truck.putItemToStorage(new Truck());
        return truck.readStorage();
    }
}
