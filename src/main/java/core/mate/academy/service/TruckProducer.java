package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks;

    public TruckProducer() {
        this.trucks = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        Truck model1 = new Truck();
        model1.setName("Truck 1");
        model1.setColor("red");
        model1.setWeightToPull(1000);
        model1.setLivingSector(true);

        Truck model2 = new Truck();
        model1.setName("Truck 2");
        model1.setColor("green");
        model2.setWeightToPull(2000);
        model2.setLivingSector(false);

        trucks.add(model1);
        trucks.add(model2);

        return trucks;
    }
}
