package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<? super Machine> get() {
        return List.of(new Truck("wurr"),new Truck("trrr"), new Truck("diner"));
    }
}
