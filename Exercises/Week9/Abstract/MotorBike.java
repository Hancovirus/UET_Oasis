public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Hello, I am a Javadoc.
     */
    public MotorBike(String brand, String model,  String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        String ans = "Motor Bike:\n";
        ans += "\tBrand: " + super.getBrand() + "\n";
        ans += "\tModel: " + super.getModel() + "\n";
        ans += "\tRegistration Number: " + super.getRegistrationNumber() + "\n";
        ans += "\tHas Side Car: " + hasSidecar + "\n";
        ans += "\tBelongs to " + super.getOwner().getName() + " - " + super.getOwner().getAddress();
        return ans;
    }
}
