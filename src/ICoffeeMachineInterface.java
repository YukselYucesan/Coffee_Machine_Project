public interface ICoffeeMachineInterface {
    void chooseCoffee() throws InterruptedException;
    void coffeeSize() throws InterruptedException;
    void milkOrNotMilk() throws InterruptedException;
    void sugarOrNotSugar() throws InterruptedException;
    void coffeePrint();
    void stoppedTheCoffeeMachine();
}
