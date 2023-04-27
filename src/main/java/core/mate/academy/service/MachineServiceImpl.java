package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private TruckProducer truckProducer = new TruckProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Truck":
                return new ArrayList<>(truckProducer.get());
            case "Excavator":
                return new ArrayList<>(excavatorProducer.get());
            case "Bulldozer":
                return new ArrayList<>(bulldozerProducer.get());
            default:
                return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
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
