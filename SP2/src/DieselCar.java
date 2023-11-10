public class DieselCar extends AFuelCar { //Nedarver fra AFuelCar
    final boolean hasParticleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    String getFuelType(){
        return "Diesel";
    }

    @Override
    public String toString() { //SEnder videre til superklassen
        return super.toString() +
                ", Fuel Type: " + getFuelType() +
                ", Has Particle Filter: " + hasParticleFilter +
                ", Registration Fee: " + getRegistrationFee();
    }

    @Override
    public int getRegistrationFee(){ //udregning af registreringsafgiften på Dieselbiler
        int kmPerLitre = getKmPrLitre();
        int registrationFee = 0;

        if (kmPrLitre >= 20 && kmPrLitre <= 50){
            registrationFee = 130;
        } else if (kmPrLitre > 15 && kmPrLitre <= 20){
            registrationFee = 1390;
        } else if (kmPrLitre > 10 && kmPrLitre <= 15){
            registrationFee = 1850;
        } else if (kmPrLitre > 5 && kmPrLitre <= 10){
            registrationFee = 2770;
        } else {
            registrationFee = 15260;
        }

        if(!hasParticleFilter){ //Hvis den har et ParticleFilter, så tilføjer den til prisen.
            registrationFee += 1000;
        }

        return registrationFee;
    }

    public int kmPrLitre() {
        return kmPrLitre;
    }

    boolean hasParticleFilter(){
        return  hasParticleFilter;
    }


}
