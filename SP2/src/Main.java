public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar gasolineCar = new GasolineCar("CMK40914", "Volvo", "V60", 4, 7);
        ElectricCar electricCar = new ElectricCar("EKN43980", "Porsche", "Taycan", 4, 100, 600);
        DieselCar dieselCar = new DieselCar("SID59919", "Volkswagen", "Passat", 4, 16, true);
        DieselCar dieselCar1 = new DieselCar("KDF39948", "Lamborghini", "Hurracan", 2, 6, true);
        GasolineCar gasolineCar1 = new GasolineCar("KSD59781", "Ferrari", "308", 2, 8);

        fleet.addCar(gasolineCar);
        fleet.addCar(gasolineCar1);
        fleet.addCar(electricCar);
        fleet.addCar(dieselCar);
        fleet.addCar(dieselCar1);

        // Print total registration fee for the fleet
        int totalFee = fleet.getTotalRegistrationFeeForFleet();
        System.out.println("\n" + "[Total Registration Fee for Fleet: " + totalFee + "]" + "\n");



        System.out.println(dieselCar + " ]" + "\n");
        System.out.println(electricCar + " ]" + "\n");
        System.out.println(gasolineCar + " ]" + "\n");
        System.out.println(gasolineCar1 + " ]" + "\n");
        System.out.println(dieselCar1 + " ]" + "\n");
    }
}
