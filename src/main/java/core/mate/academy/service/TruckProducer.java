package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();

        int randomSize = new Random().nextInt(20);
        for (int i = 0; i < randomSize; i++) {
            Truck truck = new Truck();
            truck.setCargo("Empty");
            truck.setName("Truck" + i);
            truck.setType((new Random().nextBoolean()) ? "Heavy" : "Middle");
            list.add(truck);
        }

        return list;
    }
}
