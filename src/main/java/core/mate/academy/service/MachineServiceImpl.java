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
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();
    private List<? extends Machine> machineArrayList = new ArrayList<>();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            machineArrayList = bulldozerProducer.get();
        } else if (type == Excavator.class) {
            machineArrayList = excavatorProducer.get();
        } else if (type == Truck.class) {
            machineArrayList = truckProducer.get();
        } else {
            machineArrayList = new ArrayList<>();
        }
        return new ArrayList<>(machineArrayList);
    }

    @Override
    public void fill(List<? super Machine> machineList, Machine value) {
        int size = machineList.size();
        for (int i = 0; i < size; i++) {
            machineList.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.get(i).doWork();
        }
    }

}
