package machine;
import java.util.Scanner;

public class CoffeeMachine {
    // Only allows positive integers from 0-1000 (inclusive).
    static private final String REGEX_INT_RANGE = "([-+]?\\d+)";

    static private String userInput;
    static private final CoffeeMaker deLuvos = new CoffeeMaker();
    static private final DisplayMessages messages = new DisplayMessages();

    public static void main(String[] args) {
        handleState();
    }

    // The handling for SELECT and BUY input are extracted form handleState into handleInput
    // for better maintainability.
    // I know this is a lot of code, but the instructions were clear "CoffeeMaker class only processes string input".
    // Might me being incapable, might be just a lack of experience why I didn't come up with a more elegant
    // solution for this - who knows. At least it works.
    public static void handleState() {
        Scanner scanner = new Scanner(System.in);
        switch (deLuvos.state) {
            case SELECT:
                System.out.println(messages.SELECT_MESSAGE);
                userInput = scanner.nextLine().toLowerCase().trim();
                handleInput();
                break;
            case BUY:
                System.out.println(messages.BUY_MESSAGE);
                userInput = scanner.nextLine().toLowerCase().trim();
                handleInput();
                break;
            case FILL_WATER:
                System.out.println(messages.ADD_WATER);
                userInput = scanner.nextLine().toLowerCase().trim();
                while (!userInput.matches(REGEX_INT_RANGE)) {
                    System.out.println(messages.ADD_WATER);
                    userInput = scanner.nextLine().toLowerCase().trim();
                }
                deLuvos.processInstruction(userInput);
                break;
            case FILL_MILK:
                System.out.println(messages.ADD_MILK);
                userInput = scanner.nextLine().toLowerCase().trim();
                while (!userInput.matches(REGEX_INT_RANGE)) {
                    System.out.println(messages.ADD_MILK);
                    userInput = scanner.nextLine().toLowerCase().trim();
                }
                deLuvos.processInstruction(userInput);
                break;
            case FILL_BEANS:
                System.out.println(messages.ADD_BEANS);
                userInput = scanner.nextLine().toLowerCase().trim();
                while (!userInput.matches(REGEX_INT_RANGE)) {
                    System.out.println(messages.ADD_BEANS);
                    userInput = scanner.nextLine().toLowerCase().trim();
                }
                deLuvos.processInstruction(userInput);
                break;
            case FILL_CUPS:
                System.out.println(messages.ADD_CUPS);
                userInput = scanner.nextLine().toLowerCase().trim();
                while (!userInput.matches(REGEX_INT_RANGE)) {
                    System.out.println(messages.ADD_CUPS);
                    userInput = scanner.nextLine().toLowerCase().trim();
                }
                deLuvos.processInstruction(userInput);
                break;
            case TAKE_MONEY:
                System.out.println(messages.TAKE_MESSAGE + deLuvos.getStockMoney());
                deLuvos.processInstruction("iwastootired");
                break;
            case REMAINING_STOCK:
                System.out.printf("%nThe coffee machine has:%n" +
                                "%d ml of water%n" +
                                "%d ml of milk%n" +
                                "%d g of coffee beans%n" +
                                "%d disposable cups%n" +
                                "$%d of money%n%n",
                        deLuvos.getStockWater(), deLuvos.getStockMilk(), deLuvos.getStockCoffeeBeans(),
                        deLuvos.getStockCups(), deLuvos.getStockMoney());
                deLuvos.state = MachineState.SELECT;
                handleState();
                break;
            default:
                System.out.println("Error!");
                break;
        }

    }

    // FILL_MILK, FILL_BEANS FILL_CUPS, and SELECT are set in CoffeeMachine processInstruction.
    // This is because the user must only enter "fill" once, but for every supply there is an individual
    // input/exception handling.
    // Handling of wrong input has not been required, but what piece of code would that be without it?
    public static void handleInput() {
        if (deLuvos.state == MachineState.SELECT) {
            switch (userInput) {
                case "buy":
                    deLuvos.state = MachineState.BUY;
                    handleState();
                    break;
                case "fill":
                    deLuvos.state = MachineState.FILL_WATER;
                    handleState();
                    break;
                case "take":
                    deLuvos.state = MachineState.TAKE_MONEY;
                    handleState();
                    break;
                case "remaining":
                    deLuvos.state = MachineState.REMAINING_STOCK;
                    handleState();
                    break;
                case "exit":
                    System.out.println(messages.EXIT_MESSAGE);
                    break;
                default:
                    System.out.println(messages.ERROR_SELECT_INPUT);
                    handleState();
                    break;
            }
        }
        if (deLuvos.state == MachineState.BUY) {
            switch (userInput) {
                case "1":
                case "2":
                case "3":
                    deLuvos.processInstruction(userInput);
                    break;
                case "back":
                    deLuvos.state = MachineState.SELECT;
                    handleState();
                    break;
                default:
                    System.out.println(messages.ERROR_SELECT_INPUT);
                    handleState();
                    break;
            }
        }
    }

}