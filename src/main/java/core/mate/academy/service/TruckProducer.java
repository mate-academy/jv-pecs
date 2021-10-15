package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks;

    {
        Truck trucksFirst = new Truck("TruckFirst", "White", 700);
        Truck trucksSecond = new Truck("TruckSecond", "Black", 650);
        Truck trucksThird = new Truck("TruckThird", "Orange", 750);
        trucks = List.of(trucksFirst, trucksSecond, trucksThird);
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
