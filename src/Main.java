public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();

        DeluxPizza DP = new DeluxPizza(true);
        DP.takeAway();
        DP.getBill();
    }
}