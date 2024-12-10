import java.util.Scanner;

public class CoffeeMachine implements ICoffeeMachineInterface {
    private static Scanner scanner=new Scanner(System.in);
    private static Coffee coffee;
    public void run() throws InterruptedException {
        chooseCoffee();
        coffeeSize();
        milkOrNotMilk();
        sugarOrNotSugar();
        coffeePrint();
        stoppedTheCoffeeMachine();
    }
    @Override
    public void chooseCoffee() throws InterruptedException {
        int choose=0;
        do {
            System.out.print("1- Americano\n" +
                             "2- Espresso\n" +
                             "3- Cappucino\n" +
                             "4- Latte\n" +
                             "5- Mocha\n" +
                             "6- Macchiato\n" +
                             "7- Affogato\n" +
                             "8- İce Coffee\n" +
                             "9- Frappuccino\n" +
                             "10- IrishWhich coffee\n" +
                             "0- Exit\n" +
                             "Which Coffee? = ");
            choose=scanner.nextInt();
            switch (choose){
                case 1: coffee=new Amreicano();
                    System.out.println("You choosed " + Amreicano.getCoffeeType());
                    System.out.println(Amreicano.getAmericanoHistory());break;
                case 2: coffee=new Espresso();
                    System.out.println("You choosed " + Espresso.getCoffeeType());
                    System.out.println(Espresso.getEspressoHistory());break;
                case 3: coffee=new Cappucino();
                    System.out.println("You choosed " + Cappucino.getCoffeeType());
                    System.out.println(Cappucino.getCappucinoHistory());break;
                case 4: coffee=new Latte();
                    System.out.println("You choosed " + Latte.getCoffeeType());
                    System.out.println(Latte.getLatteHistory());break;
                case 5: coffee=new Mocha();
                    System.out.println("You choosed " + Mocha.getCoffeeType());
                    System.out.println(Mocha.getMochaHistory());break;
                case 6:coffee=new Macchiato();
                    System.out.println("You choosed " + Macchiato.getCoffeeType());
                    System.out.println(Macchiato.getMacchiatoHistory());break;
                case 7: coffee=new Affogato();
                    System.out.println("You choosed " + Affogato.getCoffeeType());
                    System.out.println(Affogato.getAffogatoHistory());break;
                case 8: coffee=new IceCaffee();
                    System.out.println("You choosed " + IceCaffee.getCoffeeType());
                    System.out.println(IceCaffee.getIceCaffeeHistory());break;
                case 9: coffee=new Frappuccino();
                    System.out.println("You choosed " + Frappuccino.getCoffeeType());
                    System.out.println(Frappuccino.getFrappucinoHistory());break;
                case 10: coffee=new IrishCoffee();
                    System.out.println("You choosed " + IrishCoffee.getCoffeeType());
                    System.out.println(IrishCoffee.getIrishCoffeeHistory());break;
                case 0:
                    System.out.print("Exit in progress ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(">");
                        Thread.sleep(100);;
                    }
                    stoppedTheCoffeeMachine();
                    break;
                default: System.out.println("Mistake İnput");
            }
            if (choose==8 || choose==9){
                System.out.println("The best way is refreshing in the summer days. Excellent Decision!");
            }
        }while (choose<0 || choose>10);
    }

    @Override
    public void coffeeSize() throws InterruptedException {
        int choose=0;
        do {
            System.out.print("1- Small\n" +
                             "2- Medium\n" +
                             "3- Large\n" +
                             "4- Xlarge\n" +
                             "0- Exit\n" +
                             "Which Option? = ");
            choose=scanner.nextInt();
            switch (choose){
                case 1: coffee.setCoffeeSizes(CoffeeSizes.SMALL);
                    System.out.println("You choosed " + CoffeeSizes.SMALL + ", The coffee is starting to be prepared.");break;
                case 2: coffee.setCoffeeSizes(CoffeeSizes.MEDIUM);
                    System.out.println("You choosed " + CoffeeSizes.MEDIUM + ", The coffee is starting to be prepared.");break;
                case 3: coffee.setCoffeeSizes(CoffeeSizes.LARGE);
                    System.out.println("You choosed " + CoffeeSizes.LARGE + ", The coffee is starting to be prepared.");break;
                case 4: coffee.setCoffeeSizes(CoffeeSizes.XLARGE);
                    System.out.println("You choosed " + CoffeeSizes.XLARGE + ", The coffee is starting to be prepared.");break;
                case 0:
                    System.out.print("Exit in progress ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(">");
                        Thread.sleep(100);
                    }
                    stoppedTheCoffeeMachine();
                    break;
                default: System.out.println("Mistake İnput");
            }
        }while (choose<0 || choose>4);
    }

    @Override
    public void milkOrNotMilk() throws InterruptedException {
        int choose=0;
        do {
            System.out.print("Do you want to add milk?\n" +
                    "1- Yes\n" +
                    "2- No\n" +
                    "Which option = ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("The milk adding in yours coffee.");
                    coffee.setMilkOrNot(true);
                    break;
                case 2:
                    System.out.println("Yours coffee is preparing without milk.");
                    coffee.setMilkOrNot(false);
                    break;
                case 0:
                    System.out.print("Exit in progress ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(">");
                        Thread.sleep(100);
                    }
                    stoppedTheCoffeeMachine();
                    break;
                default: System.out.println("Mistake İnput");
            }
        }while (choose<0 || choose>2);
    }

    @Override
    public void sugarOrNotSugar() throws InterruptedException {
        int choose=0;
        do {
            System.out.print("Do you want to add sugar?\n" +
                    "1- Yes\n" +
                    "2- No\n" +
                    "Which option = ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.print("How many sugar? = ");
                    coffee.setNumbersOfSugar(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Yours coffee is preparing without sugar.");
                    coffee.setNumbersOfSugar(0);
                    break;
                case 0:
                    System.out.print("Exit in progress ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(">");
                        Thread.sleep(100);
                    }
                    stoppedTheCoffeeMachine();
                    break;
                default: System.out.println("Mistake İnput");
            }
        }while (choose<0 || choose>2);

    }

    @Override
    public void coffeePrint() {
        System.out.println(coffee);
        if (!coffee.isMilkOrNot()){
            if (coffee.getNumbersOfSugar()==0){
                System.out.println("Yours coffee prepared without milk and sugar.");
            }else {
                System.out.println("Yours coffee prepared with " + coffee.getNumbersOfSugar() + " sugars and yours coffee is not included milk");
            }
        }
        else {
            if (coffee.getNumbersOfSugar()==0){
                System.out.println("Yours coffee prepared with milk and yours coffee is not included sugar.");
            }else {
                System.out.println("Yours coffee prepared with milk and " + coffee.getNumbersOfSugar() + " sugars");
            }
        }
    }

    @Override
    public void stoppedTheCoffeeMachine() {
            System.out.println("Exited...");
            System.exit(0);
    }
}
