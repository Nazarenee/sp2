package org.example;

public class Electriccar extends ACar{
    private final int  batterycap;

    private final int maxrange;

    public Electriccar(String registration,String Make, String model,int doors,int batterycap, int maxrange){
        super(registration,Make,model,doors);
        this.batterycap=batterycap;
        this.maxrange=maxrange;


    }

    int getbatterycap() {

        return batterycap;
    }

    int getMaxrange(){
        return maxrange;
    }

    public int getWhPrKm(){
        return (batterycap/maxrange);
    }

    @Override
    public int getRegistrationFee(){
        double Kmwl = 100/(getWhPrKm()/91.25);
        if(Kmwl >20 && Kmwl<50){
            return 330;
        } else if(Kmwl>15 && Kmwl<=20){
            return 1050;
        } else if(Kmwl>=10 && Kmwl<15){
            return  2340;
        } else if(Kmwl>5 && Kmwl<10){
            return  5500;
        } else if(Kmwl<5){
            return 10470;
        }
        else {
            return 0;
        }

    }

    @Override
    public String getFuelType() {
        return "Electrical";
    }


    public String toString(){
        return "Firma: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "Registration: " + getRegistrationNumber() + "\n" +
                "Antal døre: " + getNumberOfDoors()+ "\n" +
                "Battery cap: " + getbatterycap() + "\n" +
                "maxrange: " + getMaxrange() +"\n" +
                "Registration fee:" + getRegistrationFee()+"\n" +
                "Fuel type: " + getFuelType();
                   }

}
