package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerDz110 = new Bulldozer();
        bulldozerDz110.setName("DZ-110");
        bulldozerDz110.setName("Yellow");
        bulldozerDz110.setTractionClass(5);
        bulldozerDz110.setTrackGauge(3200.0);

        Bulldozer bulldozerT170 = new Bulldozer();
        bulldozerT170.setName("T-170");
        bulldozerT170.setName("Green");
        bulldozerT170.setTractionClass(4);
        bulldozerT170.setTrackGauge(3260.0);

        Bulldozer bulldozerCatD6R = new Bulldozer();
        bulldozerCatD6R.setName("Caterpillar D6R");
        bulldozerCatD6R.setName("Yellow / Black");
        bulldozerCatD6R.setTractionClass(4);
        bulldozerCatD6R.setTrackGauge(2286);

        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozerDz110);
        bulldozerList.add(bulldozerT170);
        bulldozerList.add(bulldozerCatD6R);

        return bulldozerList;
    }
}
