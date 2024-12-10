public class Coffee {
    private boolean milkOrNot;
    private int numbersOfSugar;
    private CoffeeSizes coffeeSize;

    public boolean isMilkOrNot() {
        return milkOrNot;
    }

    public void setMilkOrNot(boolean milkOrNot) {
        this.milkOrNot = milkOrNot;
    }

    public int getNumbersOfSugar() {
        return numbersOfSugar;
    }

    public void setNumbersOfSugar(int numbersOfSugar) {
        this.numbersOfSugar = numbersOfSugar;
    }

    public CoffeeSizes getCoffeeSizes() {
        return coffeeSize;
    }

    public void setCoffeeSizes(CoffeeSizes coffeeSizes) {
        this.coffeeSize = coffeeSizes;
    }

    @Override
    public String toString() {
        return "Yours Coffee = (" +
                "Numbers Of Sugar = " + numbersOfSugar +
                ", Coffee Size = " + coffeeSize +
                ')';
    }
}
