package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int COUNT_OF_TRUCKS = 3;

    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_TRUCKS; i++) {
            listOfTrucks.add(new Truck());
        }
        return listOfTrucks;
    }
}
