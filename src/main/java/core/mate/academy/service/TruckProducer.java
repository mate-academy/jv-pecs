package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return createStandardList();
    }

    private List<Truck> createStandardList() {
        List<Truck> standardList = new ArrayList<>();
        standardList.add(getTruck("MAN", "Red", 20, 12));
        standardList.add(getTruck("DAN", "Black", 25, 12));
        standardList.add(getTruck("KAN", "Yellow", 40, 16));
        return standardList;
    }

    private Truck getTruck(String name, String color, int cargo, int fuelPer100km) {
        Truck truck = new Truck();
        truck.setName(name);
        truck.setColor(color);
        truck.setCargo(cargo);
        truck.setFuelPer100Km(fuelPer100km);
        return truck;
    }
}
