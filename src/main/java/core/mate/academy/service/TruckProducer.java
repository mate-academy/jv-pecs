package core.mate.academy.service;

import core.mate.academy.data.Trucks;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        Trucks[] trucksName = Trucks.values();
        List<Truck> truckList = new ArrayList<>();

        for (int i = 0; i < NUMBERS_OF_MODELS; i++) {
            String color = Machine.getRandomColor();
            String name = trucksName[i].toString();
            truck.of(name, color);
            truckList.add(truck);
        }
        return truckList;
    }
}
