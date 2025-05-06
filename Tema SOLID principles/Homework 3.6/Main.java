import java.util.List;
import java.util.ArrayList;


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
        System.out.println("Complex coffee machine is preparing your coffee with extra steps...");
    }
}

public class CoffeLover {
    private List<CoffeMachine> coffeMachines;

       public CoffeLover(List<CoffeMachine> coffeMachines) {
        this.coffeMachines = coffeMachines;
    }

    public void makeCoffe() {
        coffeMachines.forEach(CoffeMachine::start);
    }

    public static void main(String[] args) {
        List<CoffeMachine> injectedMachines = new ArrayList<>();
        injectedMachines.add(new SimpleCoffeMachine());
        injectedMachines.add(new ComplexCoffeMachine());

        // Injecting machines into CoffeLover
        CoffeLover user = new CoffeLover(injectedMachines);
        user.makeCoffe();
    }
}
