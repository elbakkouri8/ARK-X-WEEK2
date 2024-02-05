package VehicleRentalSystem;

public class Bike extends Vehicle{
    public Bike(String make, int model, double rentalPrice) {
        super(make, model, rentalPrice);
    }

    @Override
    public void displayInfo() {
        System.out.print("Bike Info : ");
        super.displayInfo();
    }
}
