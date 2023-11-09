package org.example;

public abstract class AFuelCar extends ACar{
public int kmL;

    public AFuelCar(String registration,String Make, String model,int doors,int kmL){
    super(registration, Make, model, doors);
    this.kmL = kmL;


}
   public String getFuelType(){
    return "";
    }

   public int kmPrLitre(){
    return kmL;
   }

   @Override
    public String toString(){
       return "Firma: " + getMake() + "\n" +
               "Model: " + getModel() + "\n" +
               "Registration: " + getRegistrationNumber() + "\n" +
               "Antal døre: " + getNumberOfDoors()+ "\n" +
               "Km/l: " +kmPrLitre();
    }

}
