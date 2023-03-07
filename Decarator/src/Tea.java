public class Tea implements Drink {

    @Override
    public String showDrink() {
        return "tea";
    }

    @Override
    public String showPrice() {
        return "150 for tea";
    }
}
