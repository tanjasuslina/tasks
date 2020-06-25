package task.exections;

import java.util.HashSet;
import java.util.Set;


public class Dishwasher {
    private final int capacity;
    private final Set<DishItem> dishes = new HashSet<>();
    private Status status = Status.READY;

    /**
     * Instantiates a new task.exections.Dishwasher.
     *
     * @param capacity the capacity of the Machine. Must be greater than zero.
     */
    public Dishwasher(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity must be more than 0.");
        this.capacity = capacity;
    }

    /**
     * Loads a dish item into the Machine
     *
     * @param item the Dishitem to be loaded
     * @throws IllegalMachineStateException     the illegal machine state exception if the status isn't READY
     * @throws MachineCapacityExceededException the machine capacity exceeded exception
     */
    public void loadDish(DishItem item) throws IllegalMachineStateException, MachineCapacityExceededException {
        if (status != Status.READY)
            throw new IllegalMachineStateException("task.exections.Dishwasher can be loaded only in READY status.");
        if (capacity - dishes.size() == 0)
            throw new MachineCapacityExceededException("Loading failed, dishwasher capacity exceeded.");
        dishes.add(item);
    }

    /**
     * Unloads all the dishes from the Machine
     *
     * @return the unloaded dish items
     * @throws IllegalMachineStateException the illegal machine state exception if the status is RUNNING
     */
    public Set<DishItem> unload() throws IllegalMachineStateException {
        if (status == Status.RUNNING)
            throw new IllegalMachineStateException("task.exections.Dishwasher can't be unloaded while RUNNING.");
        Set<DishItem> load = new HashSet<>(dishes);
        dishes.clear();
        status = Status.READY;
        return load;
    }

    /**
     * Turns on the Machine
     *
     * @throws IllegalMachineStateException the illegal machine state exception if the Machine is empty or the status isn't READY
     */
    public void turnOn() throws IllegalMachineStateException {
        if (dishes.size() == 0)
            throw new IllegalMachineStateException("Add dishes to dishwasher to start.");
        if (status != Status.READY)
            throw new IllegalMachineStateException("task.exections.Dishwasher can be started only in READY status.");
        status = Status.RUNNING;
    }

    /**
     * Turns off the Machine
     *
     * @throws IllegalMachineStateException the illegal machine state exception if the status isn't RUNNING
     */
    public void turnOff() throws IllegalMachineStateException {
        if (status != Status.RUNNING)
            throw new IllegalMachineStateException("task.exections.Dishwasher can be stopped if it is RUNNING.");
        status = Status.FINISHED;
    }
}


class DishItem {
}

enum Status {
    READY,
    RUNNING,
    FINISHED
}