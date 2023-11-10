public class ElectricCar extends ACar{ //Nedarver fra ACar
    final int batteryCapacity;
    final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        return maxRange;
    }

    public int getWhPrKm(){
        return batteryCapacity / maxRange;
    }

    public int getRegistrationFee(){ // Beregner Elafgift
        int whPrKm = getWhPrKm();

        if (whPrKm >= 20 && whPrKm <= 50) {
            return 330;
        } else if (whPrKm > 15 && whPrKm <= 20){
            return 1050;
        } else if (whPrKm > 10 && whPrKm <= 15){
            return 2340;
        } else if (whPrKm > 5 && whPrKm <= 10){
            return 5500;
        } else {
            return 10470;
        }
    }

    public String toString() { //sender det videre to superklassen
        return super.toString() +
         " Battery Capacity: " + batteryCapacity  +
                ", kWh Max Range: " + maxRange +
                ", km Registration Fee: " + getRegistrationFee();
    }
}
