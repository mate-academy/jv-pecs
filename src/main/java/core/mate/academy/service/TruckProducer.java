package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private static final int NUMBER_OF_TRUCKS = 3;

    @Override
    public List<Truck> get() {
        List<Truck> output = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_TRUCKS; i++) {
            output.add(new Truck());
        }
        return output;
    }
}
