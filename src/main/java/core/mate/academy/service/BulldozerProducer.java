package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        final Bulldozer bulldozerJcb = new Bulldozer();
        bulldozerJcb.setColor("Yellow");
        bulldozerJcb.setName("JCB");
        bulldozerJcb.setBladeWidth(4.0);
        List<Bulldozer> result = new ArrayList<>();
        result.add(bulldozerJcb);
        final Bulldozer bulldozerCat = new Bulldozer();
        bulldozerCat.setColor("Yellow");
        bulldozerCat.setName("CAT");
        bulldozerCat.setBladeWidth(4.5);
        result.add(bulldozerCat);
        return result;
    }
}
