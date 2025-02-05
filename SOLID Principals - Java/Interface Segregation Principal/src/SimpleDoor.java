public class SimpleDoor implements Door{

    private boolean isLocked;
    @Override
    public void lock() {
        isLocked = true;
    }

    @Override
    public void unlock() {
        isLocked = false;
    }

    @Override
    public boolean doorIsOpen() {
        return !isLocked;
    }
}
