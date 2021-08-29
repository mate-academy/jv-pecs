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
    private static final Class<Bulldozer> BULLDOZER = Bulldozer.class;
    private static final Class<Excavator> EXCAVATOR = Excavator.class;
    private static final Class<Truck> TRUCK = Truck.class;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> resultList = new ArrayList<>();
        if (type.equals(BULLDOZER)) {
            resultList = new BulldozerProducer().get();
        }
        if (type.equals(EXCAVATOR)) {
            resultList = new ExcavatorProducer().get();
        }
        if (type.equals(TRUCK)) {
            resultList = new TruckProducer().get();
        }
        return new ArrayList<>(resultList);
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
        for (Machine item : machines) {
            item.doWork();
        }
    }
}
