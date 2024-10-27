package HomeWork4.pizzaAndMovies.main;

import HomeWork4.pizzaAndMovies.builder.PizzaHutBuilder;
import HomeWork4.pizzaAndMovies.builder.LittleCaesarsBuilder;
import HomeWork4.pizzaAndMovies.builder.DominosBuilder;
import HomeWork4.pizzaAndMovies.enums.PizzaSize;
import HomeWork4.pizzaAndMovies.models.Pizza;
import HomeWork4.pizzaAndMovies.models.Topping;

import java.util.Arrays;

public class PizzaDriver {
    public static void main(String[] args) {
        /*
        * Create a driver program to create three pizzas one of each size with 3, 6, and 9 toppings to your
        * liking and eat() all of them
        */
        Pizza hutLarge = new PizzaHutBuilder()
                .setSize(PizzaSize.LARGE)
                .addToppings(Arrays.asList(Topping.PEPPERONI, Topping.BACON, Topping.ONIONS))
                .build();
        hutLarge.eat();

        Pizza hutMedium = new PizzaHutBuilder()
                .setSize(PizzaSize.MEDIUM)
                .addToppings(Arrays.asList(Topping.SAUSAGE, Topping.MUSHROOMS, Topping.PEPPERS, Topping.EXTRA_CHEESE, Topping.CHICKEN, Topping.OLIVES))
                .build();
        hutMedium.eat();

        Pizza hutSmall = new PizzaHutBuilder()
                .setSize(PizzaSize.SMALL)
                .addToppings(Arrays.asList(Topping.PESTO, Topping.SPINACH, Topping.BEEF))
                .build();
        hutSmall.eat();

        Pizza caesarsMedium = new LittleCaesarsBuilder()
                .setSize(PizzaSize.MEDIUM)
                .addToppings(Arrays.asList(Topping.PEPPERONI, Topping.BACON, Topping.ONIONS, Topping.SAUSAGE, Topping.TOMATO_BASIL, Topping.CHICKEN, Topping.OLIVES, Topping.SPINACH))
                .build();
        caesarsMedium.eat();

        /*
        * Now assume you purchased another two pizza chains, Little Caesars, and Dominos. You want to
        * add them to your program following the rules mentioned above.
        */
        Pizza caesarsSmall = new LittleCaesarsBuilder()
                .setSize(PizzaSize.SMALL)
                .addToppings(Arrays.asList(Topping.PEPPERONI, Topping.BACON))
                .build();
        caesarsSmall.eat();

        Pizza dominosLarge = new DominosBuilder()
                .setSize(PizzaSize.LARGE)
                .addToppings(Arrays.asList(Topping.PEPPERONI, Topping.BACON, Topping.ONIONS))
                .build();
        dominosLarge.eat();

        Pizza dominosSmall = new DominosBuilder()
                .setSize(PizzaSize.SMALL)
                .addToppings(Arrays.asList(Topping.EXTRA_CHEESE))
                .build();
        dominosSmall.eat();
    }
}
