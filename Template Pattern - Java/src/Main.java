public class Main {
    public static void main(String[] args) {
        Game g1 = new Cricket();
        g1.conductgame();

        Game g2 = new Football();
        g2.conductgame();

        Game g3 = new Handball();
        g3.conductgame();
    }
}