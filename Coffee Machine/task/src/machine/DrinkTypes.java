package machine;

enum DrinkTypes {
    ESPRESSO("Espresso", 250, 0, 16, 1, 4),
    LATTE("Latte", 350, 75, 20, 1, 7),
    CAPPUCCINO("Cappuccino", 200, 100, 12, 1, 6);

    private final String name;
    private final int water;

    private final int milk;
    private final int coffeeBeans;
    private final int cups;
    private final int money;

    DrinkTypes(String name, int water, int milk, int coffeeBeans, int cups, int cost) {
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = cost;
    }

    String getName() {
        return name;
    }

    int getCostWater() {
        return water;
    }

    int getCostMilk() {
        return milk;
    }

    int costBeans() {
        return coffeeBeans;
    }

    int costCups() {
        return cups;
    }

    int costMoney() {
        return money;
    }

}
