public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } 
        else if (item.equals("fruit")) {
            pizza = new FruitPizza(ingredientFactory);
            pizza.setName("California Style Veggie Pizza");
        } 
        else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        }
        return pizza;
    }
}