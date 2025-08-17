package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {

        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("JCB", "8016CTS", "Great Britian", 120));
        excavatorList.add(new Excavator("Liebherr", "A900ZW", "Switzerland", 250));
        excavatorList.add(new Excavator("Volvo", "EC250ENL", "Sweden", 600));
        return excavatorList;
    }
}
