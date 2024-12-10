public class Frappuccino extends Coffee{
    private static final String coffeeType="Frappuccino";
    private static String frappucinoHistory="Frappuccino is the trademarked name for iced coffee sold by Starbucks.\n" +
            "It is made by mixing coffee or other main ingredients (such as strawberries and cream) with ice and other ingredients and topping with whipped cream.\n" +
            "Frappuccino is also sold in bottles and in vending machines.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getFrappucinoHistory() {
        return frappucinoHistory;
    }
}
