public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() { 
        return new DeepDishDough(); 
    }

    @Override
    public Sauce createSauce() { 
        return new PlumTomatoSauce(); 
    }

    @Override
    public Cheese createCheese() { 
        return new MozzarellaCheese(); 
    }

    @Override
    public Fruit createFruit() { 
        return new Avocado(); 
    }

    @Override
    public Pepperoni createPepperoni() { 
        return new SlicedPepperoni(); 
    }
}