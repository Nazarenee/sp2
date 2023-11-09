package org.example;

public  class GasolineCar extends AFuelCar {
   private int Registrationfee;

    public GasolineCar(String registration, String Make, String model, int doors, int kmL) {
        super(registration, Make, model, doors, kmL);

    }


    @Override
    public String getFuelType() {
        return "Gasoline";
    }


    @Override
    public int getRegistrationFee() {
        if (kmL > 20 && kmL <= 50) {
            Registrationfee = 330;
        } else if (kmL >= 15 && kmL <= 20) {
            Registrationfee = 1050;
        } else if (kmL >= 10 && kmL < 15) {
            Registrationfee = 2340;
        } else if (kmL > 5 && kmL < 10) {
            Registrationfee = 5500;
        } else if (kmL < 5) {
            Registrationfee = 10470;
        }
        return Registrationfee;
    }

    @Override
    public String toString() {
        return "Firma: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "Registration: " + getRegistrationNumber() + "\n" +
                "Antal døre: " + getNumberOfDoors() + "\n" +
                "Km/l: " + kmPrLitre()+"\n" +
                "Registration fee:" + getRegistrationFee()+"\n" +
                "Fuel type: " + getFuelType();
    }
}