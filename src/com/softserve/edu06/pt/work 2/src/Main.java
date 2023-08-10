public class Main {
    public static void main(String[] args) {
        Car[] Cars = {
                new Sedan(),
                new Truck(),
                new Truck(),
                new Sedan(),
                new Sedan()
        };
        for (var car : Cars) {
            car.run();
            car.stop();
        }
    }
}
abstract class Car {
    abstract void run();
    abstract void stop();
}

class Sedan extends Car {
    @Override
    void run() {
        System.out.println("Sedan runs.");
    }

    @Override
    void stop() {
        System.out.println("Sedan stops.");
    }
}

class Truck extends Car {
    @Override
    void run() {
        System.out.println("Truck runs.");
    }

    @Override
    void stop() {
        System.out.println("Truck stops.");
    }
}