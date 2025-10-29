public class Car {
    private double engineVolume;
    private int doorCount;
    private String name;
    private static int countOfCars=0;
    private int fuelTank;

    public Car(double engineVolume, int doorCount, String name, int fuelTank) {
        this.engineVolume = engineVolume;
        this.doorCount = doorCount;
        this.name = name;
        this.fuelTank = fuelTank;
        countOfCars++;
    }
    public double getEngineVolume() {
            return engineVolume;
    }
    public static int getCountOfCars() {
        return countOfCars;
    }
    public double getTotalDistance() {
        return (fuelTank/(engineVolume*2))*100;
    }
}
