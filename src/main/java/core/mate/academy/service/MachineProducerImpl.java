package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerImpl<T extends Machine> implements MachineProducer<T> {

    @Override
    public List<Machine> get(int machineIndex) {
        switch (machineIndex) {
            case EXCAVATOR_INDEX:
                return produceExcavators();
            case TRUCK_INDEX:
                return produceTrucks();
            default:
                return produceBulldozers();
        }
    }

    private List<Machine> produceBulldozers() {
        List<Machine> list = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_CREATE; i++) {
            list.add(new Bulldozer());
        }
        return list;
    }

    private List<Machine> produceExcavators() {
        List<Machine> list = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_CREATE; i++) {
            list.add(new Excavator());
        }
        return list;
    }

    private List<Machine> produceTrucks() {
        List<Machine> list = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_CREATE; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
