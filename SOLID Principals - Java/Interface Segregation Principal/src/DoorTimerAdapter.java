public class DoorTimerAdapter implements TimerClient{

    private final Door door;

    public DoorTimerAdapter(Door door) {
        this.door = door;
    }

    @Override
    public void timeOut() {
        door.lock();
    }
}
