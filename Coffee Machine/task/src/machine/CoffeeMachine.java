package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int stockWater = 400;
    static int stockMilk = 540;
    static int stockCoffeeBeans = 120;
    static int stockCups = 9;
    static int stockMoney = 550;

    public static void main(String[] args) {
        selectMenu();
    }

    public static void displayMachineStatus() {
        System.out.printf("%nThe coffee machine has:%n" +
                        "%d ml of water%n" +
                        "%d ml of milk%n" +
                        "%d g of coffee beans%n" +
                        "%d disposable cups%n" +
                        "$%d of money%n",
                stockWater, stockMilk, stockCoffeeBeans, stockCups, stockMoney);
        selectMenu();
    }

    public static void selectMenu() {
        String message = "\nWrite action (buy, fill, take, remaining, exit): ";
        System.out.println(message);
        switch (getValidMenuAction()) {
            case "buy":
                selectDrink();
                break;
            case "fill":
                fillStock();
                break;
            case "take":
                takeMoney();
                break;
            case "remaining":
                displayMachineStatus();
                break;
            case "exit":
                // in case there is rage against, this might terminate the machine
                break;
            default:
                selectMenu();
                break;
        }
    }

    public static void selectDrink() {
        String displayedMessage = "\nWhat do you want to buy? 1 - espresso, 2 - latte, " +
                "3 - cappuccino, back - to main menu:";
        System.out.println(displayedMessage + "\n");
        switch (getValidSelectDrinkAction()) {
            case "1":
                processEspresso(1);
                break;
            case "2":
                processLatte(1);
                break;
            case "3":
                processCappuccino(1);
                break;
            case "back":
                selectMenu();
                break;
            default:
                selectDrink();
                break;
        }
    }

    public static void processEspresso(int orderedAmount) {
        int costWater = 250;
        int costMilk = 0;
        int costCoffeeBeans = 16;
        int costCups = 1;

        int chargeMoney = 4;

        String itemSelected = "Espresso";
        String missingItem = findMissingItem(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups);

        if (missingItem.equals("none")) {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, missingItem);
        } else {
            confirmOrder(0, missingItem);
        }
    }

    public static void processLatte(int orderedAmount) {
        int costWater = 350;
        int costMilk = 75;
        int costCoffeeBeans = 20;
        int costCups = 1;

        int chargeMoney = 7;

        String itemSelected = "Latte";
        String missingItem = findMissingItem(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups);

        if (missingItem.equals("none")) {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, missingItem);
        } else {
            confirmOrder(0, missingItem);
        }
    }

    public static void processCappuccino(int orderedAmount) {
        int costWater = 200;
        int costMilk = 100;
        int costCoffeeBeans = 12;
        int costCups = 1;

        int chargeMoney = 6;

        String itemSelected = "Cappuccino";
        String missingItem = findMissingItem(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups);

        if (missingItem.equals("none")) {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, missingItem);
        } else {
            confirmOrder(0, missingItem);
        }
    }

    public static String findMissingItem(int orderedAmount, int costWater, int costMilk, int costCoffeeBeans,
                                         int costCups) {
        if (orderedAmount * costWater > stockWater) {
            return "water";
        } else if (orderedAmount * costMilk > stockMilk) {
            return "milk";
        } else if (orderedAmount * costCoffeeBeans > stockCoffeeBeans) {
            return "coffee beans";
        } else if (orderedAmount * costCups > stockCups) {
            return "cups";
        } else {
            return "none";
        }
    }

    public static void alterStock(int orderedAmount, int costWater, int costMilk, int costCoffeeBeans,
                                  int costCups, int chargeMoney) {
        stockWater -= orderedAmount * costWater;
        stockMilk -= orderedAmount * costMilk;
        stockCoffeeBeans -= orderedAmount * costCoffeeBeans;
        stockCups -= orderedAmount * costCups;
        stockMoney += chargeMoney;
    }

    public static void fillStock() {
        String howMuchWater = "\nWrite how many ml of water you want to add:";
        String howMuchMilk = "Write how many ml of milk you want to add:";
        String howMuchCoffeeBeans = "Write how many grams of coffee beans you want to add:";
        String howMuchCups = "Write how many disposable cups of coffee you want to add:";
        System.out.println(howMuchWater);
        stockWater += getValidIntegerStock();
        System.out.println(howMuchMilk);
        stockMilk += getValidIntegerStock();
        System.out.println(howMuchCoffeeBeans);
        stockCoffeeBeans += getValidIntegerStock();
        System.out.println(howMuchCups);
        stockCups += getValidIntegerStock();
        selectMenu();
    }

    public static void takeMoney() {
        System.out.printf("%nI gave you $%d%n%n", stockMoney);
        stockMoney -= stockMoney;
        selectMenu();
    }

    public static int getValidIntegerStock() {
        String errorMessage = "\nYou may only add amounts of 0 and above";
        Scanner scanner = new Scanner(System.in);
        int inputStock = scanner.nextInt();
        while (inputStock < 0) {
            System.out.println(errorMessage);
            inputStock = scanner.nextInt();
        }
        return inputStock;
    }

    public static String getValidMenuAction() {
        Scanner scanner = new Scanner(System.in);
        String getMenuAction = scanner.nextLine().toLowerCase();
        String regexPattern = "(?i)buy|fill|take|remaining|exit";
        String errorMessage = "\nYou should enter buy, fill, take, remaining or exit";
        while (!getMenuAction.matches(regexPattern)) {
            System.out.println(errorMessage);
            getMenuAction = scanner.nextLine().toLowerCase();
        }
        return getMenuAction;
    }

    public static String getValidSelectDrinkAction() {
        Scanner scanner = new Scanner(System.in);
        String getSelectDrinkAction = scanner.nextLine().toLowerCase();
        String regexPattern = "(?i)1|2|3|back";
        String errorMessage = "\nYou should enter numbers 1, 2, 3 or type back - to main menu";
        while (!getSelectDrinkAction.matches(regexPattern)) {
            System.out.println(errorMessage);
            getSelectDrinkAction = scanner.nextLine().toLowerCase();
        }
        return getSelectDrinkAction;
    }

    public static void confirmOrder(int orderedAmount, String missingItem) {
        if (orderedAmount == 0) {
            System.out.printf("%nSorry, not enough %s!%n%n",
                    missingItem);
            selectMenu();
        } else {
            System.out.println("\nI have enough resources, making you a coffee!");
            selectMenu();
        }
    }
}