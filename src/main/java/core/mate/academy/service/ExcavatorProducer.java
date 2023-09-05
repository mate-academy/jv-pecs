package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        final Excavator excavatorJcb = new Excavator();
        excavatorJcb.setColor("Yellow");
        excavatorJcb.setName("JCB");
        excavatorJcb.setBucketVolume(3.0);
        List<Excavator> result = new ArrayList<>();
        result.add(excavatorJcb);
        final Excavator excavatorCat = new Excavator();
        excavatorCat.setColor("Yellow");
        excavatorCat.setName("CAT");
        excavatorCat.setBucketVolume(3.5);
        result.add(excavatorCat);
        return result;
    }
}
