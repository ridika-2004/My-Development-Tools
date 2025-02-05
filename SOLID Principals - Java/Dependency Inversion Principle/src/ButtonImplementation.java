public class ButtonImplementation extends Button{
    
    public ButtonImplementation(ButtonClient itsclient) {
        super(itsclient);
    }

    @Override
    public boolean getState() {
        return false;
    }
}
