package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("Volvo", "White", 500);
        Truck secondTruck = new Truck("MAN", "Black",600);
        Truck thirdTruck = new Truck("Daf", "Green", 700);
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
