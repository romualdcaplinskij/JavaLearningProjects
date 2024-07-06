
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners = new HashMap<>();


    public boolean add(LicensePlate licensePlate, String owner) {
        //assigns owner it received as parameter to the car that corresponds to the license-plate received as parameter
        //If the license-plate doesn't have the owner, method returns true. Other way method returns false and do nothing.



        if (!owners.containsKey(licensePlate)){
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        //returns the owner of the car corresponding to the licence-plate received as parameter. If car isn't in registry
        //method returns null
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        //removes the license-plate and attached data from registry. The method returns true if successfully removed.
        if (owners.containsKey(licensePlate)){
            owners.remove(licensePlate);
            return true;
        }
       return false;
    }

    public void printLicensePlates() {
        //prints the license-plates in registry
        for(LicensePlate plate: owners.keySet()) System.out.println(plate);
    }

    public void printOwners() {
        //prints owners names once even if owner owns more than one car
        HashMap<String, Boolean> uniqueOwners = new HashMap<>();
        for(String owner: owners.values()){
            if (!uniqueOwners.containsKey(owner)) {
                System.out.println(owner);
                uniqueOwners.put(owner, true);
            }
        }
    }
}
