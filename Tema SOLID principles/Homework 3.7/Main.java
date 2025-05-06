import java.util.ArrayList;
import java.util.List;

interface CoffeMachine {
    void start();
}

class SimpleCoffeMachine implements CoffeMachine {
    @Override
    public void start() {
        System.out.println("Simple coffee machine is brewing...");
    }
}

class ComplexCoffeMachine implements CoffeMachine {
    @Override
    public void start() {
        System.out.println("Complex coffee machine is preparing coffee with advanced steps...");
    }
}

public class CoffeLover {
    private List<CoffeMachine> coffeMachines = new ArrayList<>();

    public void addCoffeMachine(CoffeMachine machine) {
        coffeMachines.add(machine);
    }

    public void makeCoffe() {
        coffeMachines.forEach(CoffeMachine::start);
    }

    public static void main(String[] args) {
        CoffeLover user = new CoffeLover();
        user.addCoffeMachine(new SimpleCoffeMachine());
        user.addCoffeMachine(new ComplexCoffeMachine());

        user.makeCoffe();
    }
}
