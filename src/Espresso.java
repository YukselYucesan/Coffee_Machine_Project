public class Espresso extends Coffee{
    private static final String coffeeType="Espresso";
    public static String espressoHistory="Espresso originated in Italy in the late 19th century.\n" +
            "The first espresso machines were invented in Turin by Angelo Moriondo in 1884.\n" +
            "Although Moriondo designed the machine to brew coffee faster, the invention did not become widely available.";

    public static String getCoffeeType() {
        return coffeeType;
    }

    public static String getEspressoHistory() {
        return espressoHistory;
    }
}
