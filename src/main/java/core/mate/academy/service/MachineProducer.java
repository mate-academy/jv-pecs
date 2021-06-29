package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public interface MachineProducer {
    static List<Machine> get() {
        return new ArrayList<>();
    }
}
