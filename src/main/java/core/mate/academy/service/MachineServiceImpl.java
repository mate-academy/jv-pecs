package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private TruckProducer truckProducer = new TruckProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type != Bulldozer.class && type != Truck.class && type != Excavator.class) {
            return new ArrayList<>();
        }
        List<? extends Machine> machineList = new ArrayList<>();
        if (type == Bulldozer.class) {
            machineList = bulldozerProducer.get();
        }
        if (type == Truck.class) {
            machineList = truckProducer.get();
        }
        if (type == Excavator.class) {
            machineList = excavatorProducer.get();
        }
        return (List<Machine>) machineList;
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}
