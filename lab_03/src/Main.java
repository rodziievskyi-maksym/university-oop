public class Main {
    public static void main(String[] args) {

        Car defaultCar = new Car();

        defaultCar.setYear(1999);
        defaultCar.setModel("Renault");

        defaultCar.showDetails();

        Car modernCar = new Car(
                "BMW",
                2020,
                Car.CarTypeEnum.SEDAN,
                new Car.Engine(300, Car.Engine.EngineTypeEnum.HYBRID)
        );
        modernCar.showDetails();

        Car oldCar = new Car();
        System.out.println("Initial Car's year: " + oldCar.getYear());
        oldCar.setYear(1980);
        oldCar.showDetails();
    }
}

