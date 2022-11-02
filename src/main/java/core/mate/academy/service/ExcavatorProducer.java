package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<Excavator>  implements MachineProducer<Excavator> {
    private List<Excavator> excavatorList;

    public ExcavatorProducer(){
        excavatorList = new ArrayList<>();
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
