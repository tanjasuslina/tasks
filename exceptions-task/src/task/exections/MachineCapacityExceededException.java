package task.exections;

public class MachineCapacityExceededException extends Throwable {
    public MachineCapacityExceededException(String s) {
        super(s);
    }
}
