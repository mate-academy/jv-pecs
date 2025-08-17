package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {

        Truck truck = new Truck();
        truck.setEngineBrand("Scania");
        truck.setVolumeMakeUp(10);
        truck.setName("Renault");
        truck.setColor("Red");
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck);

        Truck truck1 = new Truck();
        truck1.setEngineBrand("Volvo");
        truck1.setVolumeMakeUp(15);
        truck1.setName("DAF");
        truck1.setColor("White");
        truckList.add(truck1);
        return truckList;
    }
}
