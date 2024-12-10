public class IrishCoffee extends Coffee{
    private static final String coffeeType="Irish Coffee";
    private static String irishCoffeeHistory="Irish Coffee is a cocktail made with coffee and Irish whiskey.\n" +
            "This drink was first invented by a restaurant owner in Ireland in the 1940s.\n" +
            "This cocktail, which contains Irish whiskey, sweet coffee, and light cream, is the perfect way to warm up on a cold, rainy day.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getIrishCoffeeHistory() {
        return irishCoffeeHistory;
    }
}
