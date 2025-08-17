package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listOfTrucks.add(new Truck());
        }
        return listOfTrucks;
    }
}
