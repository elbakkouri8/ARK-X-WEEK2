package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class RentalAgency {
    private ArrayList<Vehicle> vehicles;
    public RentalAgency(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle v){
        this.vehicles.add(v);
    }

    public void rentVehicle(Vehicle v){
        this.vehicles.remove(v);
    }

    public void displayInfo(){
        for(Vehicle v : this.vehicles){
            v.displayInfo();
        }
    }


    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

}
