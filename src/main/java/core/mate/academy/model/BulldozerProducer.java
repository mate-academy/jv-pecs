package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return listOfBulldozers();
    }

    private List<Bulldozer> listOfBulldozers() {
        List<Bulldozer> testList = new ArrayList<>();
        testList.add(getBulldozer("USA", 2019, "D348"));
        testList.add(getBulldozer("England", 2020, "3412"));
        testList.add(getBulldozer("Sweden", 2021, "3508"));
        return testList;
    }

    private Bulldozer getBulldozer(String madeIn, int year, String engineModel) {
        Bulldozer dozer = new Bulldozer();
        dozer.setMadeIn(madeIn);
        dozer.setYear(year);
        dozer.setEngineModel(engineModel);
        return dozer;
    }
}
