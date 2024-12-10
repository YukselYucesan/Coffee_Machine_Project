public class Latte extends Coffee{
    private static final String coffeeType="Latte";
    private static String latteHistory="The practice of adding milk to coffee dates back to the 17th century in Europe; however, it is thought that the latte as it is today originated in America.\n" +
            "That delicious latte with a thin layer of silky foam on top became very popular in Seattle in the 1980s.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getLatteHistory() {
        return latteHistory;
    }
}
