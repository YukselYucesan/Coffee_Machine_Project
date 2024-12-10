public class Cappucino extends Coffee{
    private static final String coffeeType="Cappucino";
    private static String cappucinoHistory="The real cappuccino was born in Italy in the 1930s.\n" +
            "An Italian named Achilles Gaggia invented the espresso machine and developed the milk frothing technique with this machine.\n" +
            "Thus, an espresso-based coffee with plenty of foam was obtained.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getCappucinoHistory() {
        return cappucinoHistory;
    }
}
