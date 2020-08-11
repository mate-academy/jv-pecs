package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    @Override
    public List<Bulldozer> get() {
        Bulldozer redBulldozer = new Bulldozer();
        redBulldozer.setName("Red");
        Bulldozer greyBulldozer = new Bulldozer();
        greyBulldozer.setName("Grey");
        Bulldozer blackBulldozer = new Bulldozer();
        blackBulldozer.setName("Black");

        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(redBulldozer);
        bulldozerList.add(greyBulldozer);
        bulldozerList.add(blackBulldozer);

        return bulldozerList;
    }
}
