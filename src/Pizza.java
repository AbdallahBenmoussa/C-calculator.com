public class Pizza {
    private int price ;
    private boolean isVegetable ;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150 ;
    private int backPackPrice = 20 ;

    private  int basePizzaPrice ;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean isVegetable) {
        this.isVegetable = isVegetable;
        if(this.isVegetable) {
            this.price = 300 ;
        } else {
            this.price = 400 ;
        }

        basePizzaPrice = this.price ;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true ;
        this.price += extraCheesePrice ;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true ;
        this.price += extraToppingsPrice ;
    }

    public void takeAway() {
        isOptedForTakeAway = true ;
        this.price += backPackPrice ;
    }

    public void getBill(){
        String bill = "";
        bill += "\n ********** BILL ********* \n ";
        System.out.println("Pizza :"+basePizzaPrice);
        if(isOptedForTakeAway){
            bill += "Extra cheese add :"+extraCheesePrice +"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Topping asses :"+extraToppingsPrice +"\n";
        }
        if(isOptedForTakeAway){
            bill +="Take Away opted :"+backPackPrice+"\n";
        }
        bill +="TOTAL :"+this.price;

        System.out.println(bill);
    }
}
