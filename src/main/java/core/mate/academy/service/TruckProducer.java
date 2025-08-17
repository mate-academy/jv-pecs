package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> output = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            output.add(new Truck((i + 1) * 20));
        }
        return output;
    }
}
