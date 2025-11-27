public class Handball extends Game {
    @Override
    protected void startgame() {
        System.out.println("Handball has started...");
    }

    @Override
    protected void endgame() {
        System.out.println("Handball has ended...");
    }

    @Override
    protected void startinterval() {
        System.out.println("Handball interval started...");
    }

    @Override
    protected void endinterval() {
        System.out.println("Handball interval ended");
    }
}
