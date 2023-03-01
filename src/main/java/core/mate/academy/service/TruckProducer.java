package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int AMOUNT_MODELS = 3;
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        for (int i = 0; i < AMOUNT_MODELS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
