package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {

        Truck truckFirst = new Truck("Old bucket","V6", 1997,120);
        Truck truckSecond = new Truck("Mustang","V4", 1991,100);
        Truck truckThird = new Truck("Porcupine","V8", 2010,180);

        List<Truck> trucks = List.of(truckFirst,truckSecond,truckThird);

        return trucks;
    }
}
