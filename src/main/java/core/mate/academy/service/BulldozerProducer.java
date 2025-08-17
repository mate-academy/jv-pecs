package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerFitst = new Bulldozer();
        bulldozerFitst.setName("JDB");
        bulldozerFitst.setColor("Green");

        Bulldozer bulldozerSecond = new Bulldozer();
        bulldozerSecond.setName("Volvo");
        bulldozerSecond.setColor("Red");

        Bulldozer bulldozerThird = new Bulldozer();
        bulldozerThird.setName("CAT");
        bulldozerThird.setColor("Black");

        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozerFitst);
        bulldozerList.add(bulldozerSecond);
        bulldozerList.add(bulldozerThird);

        return bulldozerList;
    }
}
