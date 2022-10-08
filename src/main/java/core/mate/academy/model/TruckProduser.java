package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProduser implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truck = new ArrayList<>();
        truck.add(new Truck(5, 100));
        truck.add(new Truck(6, 110));
        truck.add(new Truck(4, 90));
        return truck;
    }
}
