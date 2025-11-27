public class Football extends Game {
    @Override
    protected void startgame() {
        System.out.println("Football has started...");
    }

    @Override
    protected void endgame() {
        System.out.println("Football has ended...");
    }

    @Override
    protected void startinterval() {
        System.out.println("Football interval started...");
    }

    @Override
    protected void endinterval() {
        System.out.println("Football interval ended");
    }
}
