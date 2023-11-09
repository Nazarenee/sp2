package org.example;

public class DieselCar extends AFuelCar{
int Registrationfee;
private final boolean hasParticlefilter;
private int equalizationtax;
    public DieselCar(String registration,String Make, String model,int doors,int kmL,boolean hasParticlefilter){
        super(registration,Make,model,doors,kmL);
        this.hasParticlefilter=hasParticlefilter;
    }

    @Override
    public int getRegistrationFee(){
        if(kmL >20 && kmL<50){
            Registrationfee = 330;
            equalizationtax =130;
        } else if(kmL>15 && kmL<=20){
            Registrationfee =1050;
            equalizationtax=1390;
        } else if(kmL>=10 && kmL<15){
            Registrationfee =2340;
            equalizationtax = 1850;
        } else if(kmL>5 && kmL<10){
            Registrationfee = 5500;
            equalizationtax=2770;
        } else if(kmL<5){
            Registrationfee = 10470;
            equalizationtax=15260;
        }  if(!hasParticlefilter){
            equalizationtax+=1000;
        }
        return Registrationfee+equalizationtax;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {

        return hasParticlefilter;
    }

    public String toString(){
        return "Firma: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "Registration: " + getRegistrationNumber() + "\n" +
                "Antal døre: " + getNumberOfDoors()+ "\n" +
                "Km/l: " +kmPrLitre() + "\n" +
                "Har partikelfilter: " + hasParticleFilter()+"\n" +
                "Registration fee:" + getRegistrationFee()+"\n" +
                "Fuel type: " + getFuelType();
    }
}
