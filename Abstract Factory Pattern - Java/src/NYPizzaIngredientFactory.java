public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() { 
        return new ThinCrustDough(); 
    }

    @Override
    public Sauce createSauce() { 
        return new MarinaraSauce(); 
    }

    @Override
    public Cheese createCheese() { 
        return new RegularCheese(); 
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