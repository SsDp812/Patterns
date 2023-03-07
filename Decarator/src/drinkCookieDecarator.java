public class drinkCookieDecarator implements Drink{
    protected Drink drink;
    public drinkCookieDecarator(Drink dr){
        drink = dr;
    }
    @Override
    public String showDrink() {
        return (drink.showDrink() + " with cookie");
    }

    @Override
    public String showPrice() {
        return (drink.showPrice() + " and 45 for cookie");
    }
}
