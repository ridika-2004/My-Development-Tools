public abstract class Button {
    private ButtonClient itsclient;

    public Button(ButtonClient itsclient) {
        this.itsclient = itsclient;
    }

    public void detect(){
        boolean buttonOn = getState();
        if(buttonOn){
            itsclient.turnOn();
        } else {
            itsclient.turnOff();
        }
    }

    public abstract boolean getState();
}
