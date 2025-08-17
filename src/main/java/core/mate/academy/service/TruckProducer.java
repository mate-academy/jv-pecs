package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> listTrucks;

    public TruckProducer() {
        listTrucks = new ArrayList<>();
        listTrucks.add(new Truck("firstTruck", "gray"));
        listTrucks.add(new Truck("secondTruck", "black"));
        listTrucks.add(new Truck("thirdTruck", "green"));
    }

    @Override
    public List<Truck> get() {
        return listTrucks;
    }
}
