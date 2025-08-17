package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int BULLDOZER_NUMBER = 3;
    private List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        bulldozerList = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        for (int i = 0; i < BULLDOZER_NUMBER; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozerList.add(i,bulldozer);
        }
        return bulldozerList;
    }
}
