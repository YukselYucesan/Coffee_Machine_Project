public class Macchiato extends Coffee{
    private static final String coffeeType="Macchiato";
    private static String macchiatoHistory="Caramel macchiato is an Italian coffee flavor known for its distinctive flavor and visual appeal.\n" +
            "The origins of this delicious beverage date back to the Seattle-based coffee chain Starbucks in the 1980s.\n" +
            "An espresso-based coffee, macchiato means “stained” in Italian.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getMacchiatoHistory() {
        return macchiatoHistory;
    }
}
