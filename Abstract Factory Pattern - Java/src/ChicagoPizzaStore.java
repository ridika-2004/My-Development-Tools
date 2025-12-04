public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } 
        else if (item.equals("fruit")) {
            pizza = new FruitPizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}