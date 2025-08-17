package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private Bulldozer createBulldozerModel1() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setModel("ZX358");
        bulldozer1.setColor("RED");
        bulldozer1.setName("Shantui");
        return bulldozer1;
    }

    private Bulldozer createBulldozerModel2() {
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setModel("PTR78");
        bulldozer2.setColor("YELLOW");
        bulldozer2.setName("Komatsu");
        return bulldozer2;
    }

    @Override
    public List<Machine> get() {
        List<Machine> bulldozerList = new ArrayList<>();
        bulldozerList.add(createBulldozerModel1());
        bulldozerList.add(createBulldozerModel2());
        return bulldozerList;
    }
}
