package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = type == Bulldozer.class ? bulldozerProducer.get()
                : type == Excavator.class ? excavatorProducer.get()
                : type == Truck.class ? truckProducer.get()
                : List.of();
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> list, Machine value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).doWork();
        }
    }
}
