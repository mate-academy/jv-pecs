package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck("Volvo","red", 20),
                new Truck("Mercedes", "white", 15),
                new Truck("MAN", "yellow", 30));
    }
}
