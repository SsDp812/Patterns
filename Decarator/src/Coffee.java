public class Coffee implements Drink{
    @Override
    public String showDrink() {
        return "coffee";
    }

    @Override
    public String showPrice() {
        return "250 for coffee";
    }
}
