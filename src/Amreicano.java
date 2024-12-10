public class Amreicano extends Coffee{
    private static final String coffeeType="Amreicano";
    private static String americanoHistory="When American soldiers who came to Italy after the war were won, they found the espresso too strong and asked for water to be added to it.\n" +
            "The shop owners started calling this watery espresso, which was similar to the filter coffee taste that Americans were accustomed to,\n" +
            "an Americano, and thus a new type of coffee was born.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getAmericanoHistory() {
        return americanoHistory;
    }
}
