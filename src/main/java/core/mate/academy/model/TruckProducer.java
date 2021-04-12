package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer extends Truck implements MachineProducer {

    @Override
    public List<? super Truck> get() {
        List<Truck> truck = new ArrayList<>();
        truck.add(new Truck());
        truck.add(new Truck(true,150));
        return truck;
    }
}
