public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari");
        runRace(car);

        Car ferrari = new GasPowerCar("2022 Blue Ferrari", 15.6, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2000 Black Ferrari S56 Straddafg", 16,
                8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
