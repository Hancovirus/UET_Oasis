public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Hello, I am a Javadoc.
     */
    public Car(String brand, String model,
               String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        String ans = "Car:\n";
        ans += "\tBrand: " + super.getBrand() + "\n";
        ans += "\tModel: " + super.getModel() + "\n";
        ans += "\tRegistration Number: " + super.getRegistrationNumber() + "\n";
        ans += "\tNumber of Doors: " + numberOfDoors + "\n";
        ans += "\tBelongs to " + super.getOwner().getName() + " - " + super.getOwner().getAddress();
        return ans;
    }
}
