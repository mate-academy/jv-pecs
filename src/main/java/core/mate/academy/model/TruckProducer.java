package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return listOfTrucks();
    }

    private List<Truck> listOfTrucks() {
        List<Truck> truck = new ArrayList<>();
        truck.add(getTruck("Red", 3, 15));
        truck.add(getTruck("Black", 4, 25));
        truck.add(getTruck("White", 3, 10));
        return truck;
    }

    private Truck getTruck(String color, int fuelPerHour, int size) {
        Truck truck = new Truck();
        truck.setColor(color);
        truck.setFuelPerHour(fuelPerHour);
        truck.setSize(size);
        return truck;
    }
}
