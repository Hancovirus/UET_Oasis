import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Hello, I am a Javadoc.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Hello, I am a Javadoc.
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle temp : vehicleList) {
            if (temp.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(temp);
                break;
            }
        }
    }

    /**
     * Hello, I am a Javadoc.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        }
        String ans = name + " has:\n" + "\n";
        for (Vehicle temp : vehicleList) {
            ans += temp.getInfo() + "\n";
        }
        return ans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
