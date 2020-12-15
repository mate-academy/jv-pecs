package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> listTrucks = List.of(new Truck(),new Truck(),new Truck());
        return listTrucks;
    }
}
