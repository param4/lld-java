package DecoratorPattern;

import DecoratorPattern.pizzas.BasePizza;
import DecoratorPattern.pizzas.VegDeliteBasePizza;
import DecoratorPattern.toppings.ExtraCheeseTopping;
import DecoratorPattern.toppings.ExtraJalapenoTopping;

public class PizzaShop {
    public static void main(String args[]) {
        BasePizza pizza = new VegDeliteBasePizza();
        pizza = new ExtraCheeseTopping(pizza);
        pizza = new ExtraJalapenoTopping(pizza);
        int cost = pizza.cost();
        System.out.println(cost);
    }
}
