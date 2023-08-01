package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();

        Excavator excavator1 = new Excavator("Electric Drive", "Caterpillar chassis",
                "Career purpose");
        excavator1.setName("excavator1");
        excavator1.setColor("Yellow");
        excavatorList.add(excavator1);

        Excavator excavator2 = new Excavator("Diesel Drive", "Wheels chassis",
                "Construction purpose");
        excavator2.setName("excavator2");
        excavator2.setColor("Red");
        excavatorList.add(excavator2);

        Excavator excavator3 = new Excavator("Combined Drive", "Caterpillar chassis",
                "Universal purpose");
        excavator3.setName("excavator3");
        excavator3.setColor("Navy");
        excavatorList.add(excavator3);

        return excavatorList;
    }
}
