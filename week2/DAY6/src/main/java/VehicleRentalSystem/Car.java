package VehicleRentalSystem;

public class Car extends Vehicle{
    public Car(String make, int model, double rentalPrice) {
        super(make, model, rentalPrice);
    }

    @Override
    public void displayInfo() {
        System.out.print("Car Info : ");
        super.displayInfo();
    }
}
