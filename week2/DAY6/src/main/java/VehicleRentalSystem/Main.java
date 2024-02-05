package VehicleRentalSystem;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        

        vehicles.add(new Vehicle("mercedes" , 2020,1000));
        vehicles.add(new Vehicle("BMW     " , 2023,1400));
        vehicles.add(new Vehicle("FERRARI " , 2022,5000));
        vehicles.add(new Vehicle("RENAULT " , 2010,250));

        Car car1= new Car("dacia" , 2010, 300);
        Car car2= new Car("RENAULT" , 2011, 350);
        Car car3= new Car("opel" , 2012, 400);

        Bike bike1= new Bike("yamaha" , 2024, 500);
        Bike bike2= new Bike("103" , 1999, 10);
        Bike bike3= new Bike("kawazaki" , 2023, 400);

        RentalAgency rentalAgency = new RentalAgency(vehicles);
        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(car2);
        rentalAgency.addVehicle(car3);
        rentalAgency.addVehicle(bike1);
        rentalAgency.addVehicle(bike2);
        rentalAgency.addVehicle(bike3);

        rentalAgency.displayInfo();

        rentalAgency.rentVehicle(car1);
        rentalAgency.rentVehicle(bike2);

        System.out.println("apres la rent");
        rentalAgency.displayInfo();

    }
}
