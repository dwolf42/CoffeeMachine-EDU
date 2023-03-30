package machine;

public class CoffeeMaker {
    // This is the default stock of the machine
    private int stockWater;
    private int stockMilk;
    private int stockCoffeeBeans;
    private int stockCups;
    private int stockMoney;

    MachineState state;
    DrinkTypes drink;

    // No-argument constructor to initialize the instance of the class
    CoffeeMaker() {
        final int stockWater = 400;
        final int stockMilk = 540;
        final int stockCoffeeBeans = 120;
        final int stockCups = 9;
        final int stockMoney = 550;

        this.stockWater = stockWater;
        this.stockMilk = stockMilk;
        this.stockCoffeeBeans = stockCoffeeBeans;
        this.stockCups = stockCups;
        this.stockMoney = stockMoney;
        this.state = MachineState.SELECT;
    }

    // The objective was to have a method in the coffee machine which takes a string as argument, and processes it
    // depending on the current machine state.
    void processInstruction(String userInput) {
        switch (state) {
            case BUY:
                if (userInput.equals("1")) {
                    drink = DrinkTypes.ESPRESSO;
                    cookCoffee();
                }
                if (userInput.equals("2")) {
                    drink = DrinkTypes.LATTE;
                    cookCoffee();
                }
                if (userInput.equals("3")) {
                    drink = DrinkTypes.CAPPUCCINO;
                    cookCoffee();
                }
                if (userInput.equals("exit")) {
                    state = MachineState.SELECT;
                    CoffeeMachine.handleState();
                }
                break;
            case FILL_WATER:
                if (!userInput.equals("0")) {
                    stockWater += Integer.parseInt(userInput);
                }
                state = MachineState.FILL_MILK;
                CoffeeMachine.handleState();
                break;
            case FILL_MILK:
                if (!userInput.equals("0")) {
                    stockMilk += Integer.parseInt(userInput);
                }
                state = MachineState.FILL_BEANS;
                CoffeeMachine.handleState();
                break;
            case FILL_BEANS:
                if (!userInput.equals("0")) {
                    stockCoffeeBeans += Integer.parseInt(userInput);
                }
                state = MachineState.FILL_CUPS;
                CoffeeMachine.handleState();
                break;
            case FILL_CUPS:
                if (!userInput.equals("0")) {
                    stockCups += Integer.parseInt(userInput);
                }
                state = MachineState.SELECT;
                CoffeeMachine.handleState();
                break;
            case TAKE_MONEY:
                stockMoney -= stockMoney;
                state = MachineState.SELECT;
                CoffeeMachine.handleState();
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

    private void cookCoffee() {
        DisplayMessages messages = new DisplayMessages();
        String whatsMissing = findMissingItem();
        if (whatsMissing.equals("none")) {
            stockWater -= drink.getCostWater();
            stockMilk -= drink.getCostMilk();
            stockCoffeeBeans -= drink.costBeans();
            stockCups -= drink.costCups();
            stockMoney += drink.costMoney();
            System.out.println(messages.CONFIRM_ORDER);
        } else {
            System.out.println(messages.MISSING_ITEM + whatsMissing);
        }
        state = MachineState.SELECT;
        CoffeeMachine.handleState();

    }

    // Determine if there are plenty of goods to make a certain coffee
    // Note: In case of multiple missing items, only the occurrence of the first item will be displayed!
    private String findMissingItem() {
        final String water = "water!";
        final String milk = "milk!";
        final String coffeeBeans = "coffee beans!";
        final String cups = "cups!";
        final String none = "none";

        if (drink.getCostWater() > stockWater) {
            return water;
        } else if (drink.getCostMilk() > stockMilk) {
            return milk;
        } else if (drink.costBeans() > stockCoffeeBeans) {
            return coffeeBeans;
        } else if (drink.costCups() > stockCups) {
            return cups;
        }

        return none;
    }

    int getStockWater() {
        return stockWater;
    }

    int getStockMilk() {
        return stockMilk;
    }

    int getStockCoffeeBeans() {
        return stockCoffeeBeans;
    }

    int getStockCups() {
        return stockCups;
    }

    int getStockMoney() {
        return stockMoney;
    }

}