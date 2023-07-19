package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck();
    private Truck truck2 = new Truck();
    private Truck truck3 = new Truck();
    private List<Truck> trucks = List.of(truck1, truck2, truck3);

    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<>();
        for (Object element : trucks) {
            listOfTrucks.add((Truck) element);
        }
        return listOfTrucks;
    }
}

