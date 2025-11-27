public class Cricket extends Game {
    @Override
    protected void startgame() {
        System.out.println("Cricket has started...");
    }

    @Override
    protected void endgame() {
        System.out.println("Cricket has ended...");
    }

    @Override
    protected void startinterval() {
        System.out.println("Cricket interval started...");
    }

    @Override
    protected void endinterval() {
        System.out.println("Cricket interval ended");
    }
}
