package org.example;

public abstract class ACar implements Car{
   private final String registration;
    private final String Make;
   private final String model;
   private final int doors;

    public ACar(String registration,String Make, String model,int doors){
        this.model=model;
        this.Make=Make;
        this.doors=doors;
        this.registration=registration;

    }

    @Override
    public String getMake() {

        return Make;
    }

    @Override
    public String getRegistrationNumber() {

        return registration;
    }

    @Override
    public String getModel() {

        return model;
    }

    @Override
    public int getNumberOfDoors() {

        return doors;
    }

    public abstract String getFuelType();

    @Override
    public String toString(){
        return "Firma: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "Registration: " + getRegistrationNumber() + "\n" +
                "Antal døre: " + getNumberOfDoors();    }

}
