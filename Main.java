package org.example;

public class Main {
    public static void main(String[] args) {

        FleetOfCars f = new FleetOfCars();

        GasolineCar g1 = new GasolineCar("morten","tesla","y",4,30);
        Electriccar el1 = new Electriccar("kongen","porsche","taycan",4,500,1);
        DieselCar d1 = new DieselCar("Jesper","Lamborghini","urus",4,4,false);
        f.carsadd(g1);
        f.carsadd(el1);
        f.carsadd(d1);

        System.out.println(d1.getRegistrationFee());
        System.out.println(g1.getRegistrationFee());
        System.out.println(el1.getRegistrationFee());


        System.out.println(f.toString());

    }
}