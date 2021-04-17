package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<?> getAll(Class<? extends Machine> type) {
        ExcavatorProducer<Excavator> excavatorProducer = new ExcavatorProducer<>();
        BulldozerProducer<Bulldozer> bulldozerProducer = new BulldozerProducer<>();
        TruckProducer<Truck> truckTruckProducer = new TruckProducer<>();

        return type.equals(Excavator.class) ? excavatorProducer.get()
                : type.equals(Bulldozer.class) ? bulldozerProducer.get()
                : type.equals(Truck.class) ? truckTruckProducer.get()
                : new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
