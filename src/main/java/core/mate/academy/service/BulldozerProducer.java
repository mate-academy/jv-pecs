package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer();
    private Bulldozer bulldozer2 = new Bulldozer(true, 2);
    private Bulldozer bulldozer3 = new Bulldozer(false, 1);

    public Bulldozer getBulldozer1() {
        return bulldozer1;
    }

    public void setBulldozer1(Bulldozer bulldozer1) {
        this.bulldozer1 = bulldozer1;
    }

    public Bulldozer getBulldozer2() {
        return bulldozer2;
    }

    public void setBulldozer2(Bulldozer bulldozer2) {
        this.bulldozer2 = bulldozer2;
    }

    public Bulldozer getBulldozer3() {
        return bulldozer3;
    }

    public void setBulldozer3(Bulldozer bulldozer3) {
        this.bulldozer3 = bulldozer3;
    }

    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> listOfBulldozers = new ArrayList<>();
        listOfBulldozers.add(bulldozer1);
        listOfBulldozers.add(bulldozer2);
        listOfBulldozers.add(bulldozer3);
        return listOfBulldozers;
    }
}
