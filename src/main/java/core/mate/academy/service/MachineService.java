package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.List;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService {

    List<Machine> getAll ( Class<? extends Machine> type );

    void fill ( List<? super Machine> machines, Machine value );

    void startWorking ( List<? extends Machine> machines );
}
