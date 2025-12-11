public class Main {
    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new ChocolateDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Total " + coffee.getCost() + " tk");
    }
}
