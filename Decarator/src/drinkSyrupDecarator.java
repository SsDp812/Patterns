public class drinkSyrupDecarator implements Drink{
    protected Drink drink;
    public drinkSyrupDecarator(Drink dr){
        drink = dr;
    }
    @Override
    public String showDrink() {
        return (drink.showDrink() + " with syrup");
    }

    @Override
    public String showPrice() {
        return (drink.showPrice() + " and 50 for syrup");
    }
}
