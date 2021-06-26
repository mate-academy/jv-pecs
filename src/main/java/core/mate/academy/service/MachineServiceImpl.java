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

    private TruckProducer truckProducer = new TruckProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> result = new ArrayList<>();
        if (type == Truck.class) {
            result.addAll(truckProducer.get());
        } else if (type == Excavator.class) {
            result.addAll(excavatorProducer.get());
        } else if (type == Bulldozer.class) {
            result.addAll(bulldozerProducer.get());
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();

        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();
    }
}
