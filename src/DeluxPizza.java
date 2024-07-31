public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean isVegetable) {
        super(isVegetable);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
}
