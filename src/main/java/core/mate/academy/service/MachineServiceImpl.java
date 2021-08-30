package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<Object> machines, Object value) {

    }

    @Override
    public void startWorking(List<Object> machines) {

    }

    /*public static void main(String[] args) {
        List<Bulldozer> first = new ArrayList<>();
        List<Object> second = new ArrayList<>();

        forEachInCollection(first);
        //forEachInCollection(second);

        //fillCollection(first);
        fillCollection(second);
    }

    public static void fillCollection(List<? super Machine> input ) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        input.add(bulldozer);
        input.add(excavator);
    }

    public static void forEachInCollection(List<? extends Machine> input) {
        for (Machine current : input) {
            System.out.println(current.getName());
        }
    }*/
}
