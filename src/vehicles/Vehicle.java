package vehicles;

public class Vehicle {
    String name;
    int velocity;
    int maximumVelocity;
    int mileage;

    public Vehicle(String name, int velocity, int maximumVelocity, int mileage) {
        this.name = name;
        this.velocity = velocity;
        this.maximumVelocity = maximumVelocity;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getMaximumVelocity() {
        return maximumVelocity;
    }

    public int getMileage() {
        return mileage;
    }
}
