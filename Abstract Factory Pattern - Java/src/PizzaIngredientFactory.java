public interface PizzaIngredientFactory {
    
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Fruit createFruit();
    Pepperoni createPepperoni();
}