package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProduser implements MachineProducer<Truck> {
    private List<Truck> truckList;

    public TruckProduser() {
        truckList = new ArrayList<>();
        truckList.add(new Truck("First", "black", 800, "Germany", 82.0));
        truckList.add(new Truck("Second", "grey", 900, "France", 80.0));
        truckList.add(new Truck("Third", "white", 950, "UK", 85.0));
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
