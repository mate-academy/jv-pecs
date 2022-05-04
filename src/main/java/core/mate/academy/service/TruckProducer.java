package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        ArrayList<Truck> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(new Truck("Volvo", 6));
        listOfTrucks.add(new Truck("Man", 8));
        return listOfTrucks;
    }
}
