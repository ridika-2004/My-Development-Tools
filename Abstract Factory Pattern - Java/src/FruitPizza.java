public class FruitPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public FruitPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        fruit = ingredientFactory.createFruit();
    }
}