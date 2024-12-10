public class Affogato extends Coffee{
    private static final String coffeeType="Affogato";
    private static String affogatoHistory="It is not known exactly how Affogato coffee came into being.\n" +
            "However, its spread worldwide dates back to the late 1900s. It is also known as espresso with ice cream.\n" +
            "Although originally considered a dessert, some restaurants and cafes in Italy still classify Affogato as a drink.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getAffogatoHistory() {
        return affogatoHistory;
    }
}
