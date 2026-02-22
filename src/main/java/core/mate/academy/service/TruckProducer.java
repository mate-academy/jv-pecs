package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int TRUCK_AMOUNT = 5;

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();

        for (int i = 0; i < TRUCK_AMOUNT; i++) {
            Truck truck = createMachine(
                    "T- " + i,
                    i % 2 == 0 ? "red" : "yellow"
            );
            list.add(truck);
        }

        return list;
    }

    private Truck createMachine(String name, String color) {
        Truck truck = new Truck();
        truck.setName(name);
        truck.setColor(color);

        return truck;
    }
}
