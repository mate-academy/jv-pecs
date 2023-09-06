package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        final Excavator excavatorJcb = new Excavator();
        excavatorJcb.setColor("Yellow");
        excavatorJcb.setName("JCB");
        excavatorJcb.setBucketVolume(3.0);
        final Excavator excavatorCat = new Excavator();
        excavatorCat.setColor("Yellow");
        excavatorCat.setName("CAT");
        excavatorCat.setBucketVolume(3.5);
        List<Excavator> result = new ArrayList<>();
        result.add(excavatorJcb);
        result.add(excavatorCat);
        return result;
    }
}
