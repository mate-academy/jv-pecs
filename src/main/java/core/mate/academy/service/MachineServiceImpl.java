package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    public static void main(String[] args) {
    }

    /**
     * Return the list of machines.
     * In the implementation of this method please use your MachineProducer implementations
     * See that 'Class type' is not parametrized.
     * Consider to parametrize this Class< PARAMETRIZE_ME > with specific wildcard bounding
     *
     * @param type - any class of Machine sub class. For example: Track.class or Bulldozer.class
     * @return the list of machines
     */
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Track.class.equals(type)) {
            return new TrackProducer().get();
        }
        if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer().get();
        }
        if (Excavator.class.equals(type)) {
            return new ExcavatorProducer().get();
        }
        throw new IllegalArgumentException("Wrong class");
    }

    /**
     * Fill the machines list with passed value
     * Replace the Object with parametrized value.
     * This method should be able to work well with any type of machine passed as 'value'
     *
     * @param list  - list of machines to be filled with value
     * @param value - any object of machine sub class
     */
    @Override
    public void fill(List<? super Machine> list, Machine value) {
        int size = list.size();

        for (int i = 0; i < size; i++) {
            list.set(i, value);
            list.add(value);
        }
    }

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of tracks.
     *
     * @param list - the list of machines
     */
    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
