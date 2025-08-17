package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("MAN", "White", "TGL");
        Truck secondTruck = new Truck("MAN", "White", "eTGM");
        Truck thirdTruck = new Truck("MAN", "White", "TGE");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
