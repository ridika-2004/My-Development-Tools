public class App {
    public static void main(String[] args) {
        System.out.println(AnsiColors.Red.colorize("This is niloy!"));
        System.out.println(AnsiColors.Blue.colorize("This is a laptop!"));
        System.out.println(AnsiColors.Bold.and(AnsiColors.Green).colorize("This is bold green text!"));
    }
}
