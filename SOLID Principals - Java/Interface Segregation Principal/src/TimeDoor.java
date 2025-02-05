public class TimeDoor implements Door{

    private Timer timer;
    private DoorTimerAdapter timerAdapter;
    private boolean isLocked;

    public TimeDoor(Timer timer) {
        this.timer = timer;
        this.timerAdapter = new DoorTimerAdapter(this);
    }

    @Override
    public void lock() {
        isLocked = true;
    }

    @Override
    public void unlock() {
        isLocked = false;
        timer.register(300,timerAdapter);
    }

    @Override
    public boolean doorIsOpen() {
        return !isLocked;
    }
}
