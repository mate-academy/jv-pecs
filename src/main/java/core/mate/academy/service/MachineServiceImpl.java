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

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machinesList = new ArrayList<>();
        List<? extends Machine> subMachine = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            subMachine = new BulldozerProducer().get();
        } else if (type.equals(Truck.class)) {
            subMachine = new TruckProducer().get();
        } else if (type.equals(Excavator.class)) {
            subMachine = new ExcavatorProducer().get();
        }
        for (int i = 0; i < subMachine.size(); i++) {
            machinesList.add(subMachine.get(i));
        }
        return machinesList;
    }

    @Override
    public void fill(List<? super Bulldozer> machines, Bulldozer value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void fill(List<? super Excavator> machines, Excavator value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void fill(List<? super Truck> machines, Truck value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
