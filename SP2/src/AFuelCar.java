public abstract class AFuelCar extends ACar { // Nedarve fra ACar
    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }
    abstract String getFuelType(); // skal returne Gasoline eller Diesel

    public int getKmPrLitre(){ // should return how many kilometres the car can drive on 1 litre of fuel
        return kmPrLitre;

    }

}