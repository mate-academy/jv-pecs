package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
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
        if (Bulldozer.class.equals(type)) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            return new ArrayList<>(bulldozers);
        }
        if (Excavator.class.equals(type)) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            return new ArrayList<>(excavators);
        }
        if (Track.class.equals(type)) {
            List<Track> tracks = new TrackProducer().get();
            return new ArrayList<>(tracks);
        }
        throw new IllegalArgumentException("Wrong class");
    }

    /**
     * Fill the machines list with passed value
     * Replace the Object with parametrized value.
     * This method should be able to work well with any type of machine passed as 'value'
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
        for (int i = machines.size(); i > 0; i--) {
            machines.add(value);
        }
    }

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of tracks.
     *
     * @param machines - the list of machines
     */
    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}
