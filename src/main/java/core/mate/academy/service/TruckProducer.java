package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck volvo = new Truck("Volvo FH16", 600, 2021, 25000);
        Truck scania = new Truck("Scania S650", 650, 2020, 28000);
        Truck mercedes = new Truck("Mercedes-Benz Actros", 625, 2022, 30000);
        return List.of(volvo, scania, mercedes);
    }
}
