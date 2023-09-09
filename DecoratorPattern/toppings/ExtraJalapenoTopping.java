package DecoratorPattern.toppings;

import DecoratorPattern.pizzas.BasePizza;

public class ExtraJalapenoTopping extends Topping {
    BasePizza basePizza;

    public ExtraJalapenoTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override()
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
