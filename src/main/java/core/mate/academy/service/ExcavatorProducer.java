package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {

        Excavator excavator = new Excavator();
        excavator.setDifferential("DAF");
        excavator.setHydraulicTank("Univis N46");
        List<Excavator> excavatorList = new ArrayList<>();
        excavator.setName("Manitou");

        excavator.setColor("Red");
        excavatorList.add(excavator);

        Excavator excavator1 = new Excavator();
        excavator1.setDifferential("MAN");
        excavator1.setHydraulicTank("Univis N68");
        excavator1.setName("Manitou1");
        excavator1.setColor("Yellow");
        excavatorList.add(excavator1);
        return excavatorList;
    }
}
