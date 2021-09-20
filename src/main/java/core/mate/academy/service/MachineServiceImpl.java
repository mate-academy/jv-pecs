package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<Machine> implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {

    }

    @Override
    public void startWorking(List list) {

    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {

    }



/*
    @Override
    public void fill(List<? super Machine> machines, Machine value) {

    }
*/





/*    @Override
    public List getAll(Class type) {
        Bulldozer test = new Bulldozer();
        if (type.getClass().equals(Bulldozer.class)){
            return new BulldozerProducer().get();
        }
        return null;
    }

*//*    @Override
    public void fill(List list, Object value) {

    }*//*

    @Override
    public void startWorking(List list) {

    }

    @Override
    public void fill(List<?> list, Object value) {
        if (value.getClass().equals(Bulldozer.class)) {
            Collection<Machine> machines = (Collection<Machine>) list;
            this.machines.addAll(machines);
        }
    }*/
}
