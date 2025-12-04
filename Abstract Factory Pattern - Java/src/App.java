public class App {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Sally ordered: " + pizza + "\n");
    }
}