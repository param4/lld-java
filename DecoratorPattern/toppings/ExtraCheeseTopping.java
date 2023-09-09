package DecoratorPattern.toppings;

import DecoratorPattern.pizzas.BasePizza;

public class ExtraCheeseTopping extends Topping {
    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override()
    public int cost() {
        return this.basePizza.cost() + 20;
    }   
}
