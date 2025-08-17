package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorHyundai = new Excavator();
        excavatorHyundai.setName("HYUNDAI R220LC-9S");
        excavatorHyundai.setColor("Yellow");
        excavatorHyundai.setFrontShovel(false);
        excavatorHyundai.setBucketVolume(1.2);

        Excavator excavatorJcb = new Excavator();
        excavatorJcb.setName("JCB 3 CX");
        excavatorJcb.setColor("Yellow");
        excavatorJcb.setFrontShovel(false);
        excavatorJcb.setBucketVolume(1.1);

        Excavator excavatorHitachi = new Excavator();
        excavatorHitachi.setName("Hitachi ZX70-5G");
        excavatorHitachi.setColor("Orange");
        excavatorHitachi.setFrontShovel(true);
        excavatorHitachi.setBucketVolume(0.33);

        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavatorHyundai);
        excavatorList.add(excavatorJcb);
        excavatorList.add(excavatorHitachi);

        return excavatorList;
    }
}
