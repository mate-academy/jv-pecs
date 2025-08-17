package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck first = new Truck("volvo", "black", 70, 60);
        Truck second = new Truck("mercedes", "red", 80, 70);
        Truck third = new Truck("renault", "green", 65,70);
        return List.of(first,second,third);
    }
}
