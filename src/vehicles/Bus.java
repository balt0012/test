package vehicles;

public class Bus extends Vehicle{
    private int maxCapacity;
    private int maximumVelocity;

    public Bus(String name, int velocity, int mileage) {
        super(name, velocity, 120, mileage);
        this.maxCapacity = 50;
    }

    public void accelerate(int velocity) {
        if(this.velocity < 120) {
            this.velocity += 5;
        if(this.velocity > 120) {
            this.velocity = 120;
            }
        }
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getMaximumVelocity() {
        return maximumVelocity;
    }
}
