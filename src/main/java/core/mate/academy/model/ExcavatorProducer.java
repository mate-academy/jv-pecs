package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setColor("Yellow");
        excavator1.setName("Komatsu");

        Excavator excavator2 = new Excavator();
        excavator2.setColor("Green");
        excavator2.setName("Liebherr");

        Excavator excavator3 = new Excavator();
        excavator3.setColor("Black");
        excavator3.setName("Volvo");

        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        excavatorList.add(excavator3);

        return excavatorList;
    }
}
