import java.util.Scanner;

// Interface
interface CoffeMachine {
    void start();
}

// Simple implementation
class SimpleCoffeMachine implements CoffeMachine {
    @Override
    public void start() {
        System.out.println("Simple coffee machine is brewing your coffee...");
    }
}

// Complex implementation
class ComplexCoffeMachine implements CoffeMachine {
    @Override
    public void start() {
        System.out.println("Complex coffee machine is grinding beans, heating water, and brewing your premium coffee...");
    }
}

// User's choice-based coffee lover class
public class CoffeLover {
    private CoffeMachine machine;

    public CoffeLover(CoffeMachine machine) {
        this.machine = machine;
    }

    public void makeCoffe() {
        machine.start();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your coffee machine:");
        System.out.println("1. Simple Coffee Machine");
        System.out.println("2. Complex Coffee Machine");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();
        CoffeMachine machine;

        switch (choice) {
            case 1:
                machine = new SimpleCoffeMachine();
                break;
            case 2:
                machine = new ComplexCoffeMachine();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Simple Coffee Machine.");
                machine = new SimpleCoffeMachine();
                break;
        }

        CoffeLover user = new CoffeLover(machine);
        user.makeCoffe();

        scanner.close();
    }
}
