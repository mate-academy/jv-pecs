package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    int AMOUNT_TO_CREATE = 3;
    int BULLDOZER_INDEX = 0;
    int EXCAVATOR_INDEX = 1;
    int TRUCK_INDEX = 2;

    List<Machine> get(int machineTypeIndex);
}
