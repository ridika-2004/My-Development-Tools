public abstract class Game {

    protected abstract void startgame();
    protected abstract void endgame();
    protected abstract void startinterval();
    protected abstract void endinterval();

    public void conductgame() {
        startgame();
        startinterval();
        endinterval();
        endgame();
        System.out.println("Game occured successfully!\n");
    }
}
