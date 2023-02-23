package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List get() {
        Bulldozer bulldozerMan = new Bulldozer("MAN", 1000, 5000);
        Bulldozer bulldozerCat = new Bulldozer("CAT", 1200, 5000);
        Bulldozer bulldozerVolvo = new Bulldozer("Volvo", 1100, 5100);
        List<Bulldozer> bulldozerList = List.of(bulldozerMan, bulldozerCat, bulldozerVolvo);
        return bulldozerList;
    }
}
