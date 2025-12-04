public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Fruit fruit;
    Pepperoni pepperoni;

    abstract void prepare();

    void bake() {
        System.out.println("Bake...");
    }

    void cut() {
        System.out.println("Cut...");
    }

    void box() {
        System.out.println("Place in Box...");
    }

    void setName(String name) { 
        this.name = name; 
    }

    String getName() { 
        return name; 
    }

    public String toString() {
        String result = "";

        if (dough != null) {
            result+=dough.getName() + "\n";
        }
        if (sauce != null) {
            result+=sauce.getName() + "\n";
        }
        if (cheese != null) {
            result+=cheese.getName() + "\n";
        }
        if(fruit != null) {
            result+=fruit.getName() + "\n";
        }
        if (pepperoni != null) {
            result+=pepperoni.getName() + "\n";
        }
        return result;
    }
}