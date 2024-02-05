package VehicleRentalSystem;

public class Vehicle {
    private String make;
    private int model;
    private double rentalPrice;

    public Vehicle(String make, int model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }


    public void displayInfo(){
        System.out.println("Make : " + this.make + " model : " + this.model + " rental price : " + this.rentalPrice );
    }



    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }
}
