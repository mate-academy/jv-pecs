package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private List<Bulldozer> list = new ArrayList<>();
    private Bulldozer firstBulldozer = new Bulldozer();
    private Bulldozer secondBulldozer = new Bulldozer();
    private Bulldozer thirdBulldozer = new Bulldozer();

    {
        list.add(firstBulldozer);
        list.add(secondBulldozer);
        list.add(thirdBulldozer);
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
