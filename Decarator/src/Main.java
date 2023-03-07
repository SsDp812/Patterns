public class Main {
    public static void main(String[] args) {
        Drink tea = new Tea();
        Drink coffee = new Coffee();
        Drink coffeeWithSyrupWithCookie = new drinkSyrupDecarator(new drinkCookieDecarator(coffee));

        System.out.println(tea.showDrink());
        System.out.println(tea.showPrice());
        System.out.println(coffeeWithSyrupWithCookie.showDrink());
        System.out.println(coffeeWithSyrupWithCookie.showPrice());
        System.out.println();
    }
}