package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(new Truck("00012FD3", 70));
        listOfTrucks.add(new Truck("00011FF1", 85));
        return listOfTrucks;
    }
}
