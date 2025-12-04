public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() { 
        return new GlutenFreeDough(); 
    }

    @Override
    public Sauce createSauce() { 
        return new OrganicTomatoSauce(); 
    }

    @Override
    public Cheese createCheese() { 
        return new GoatCheese(); 
    }

    @Override
    public Fruit createFruit() { 
        return new Avocado();
    }

    @Override
    public Pepperoni createPepperoni() { 
        return new OrganicPepperoni(); 
    }
}