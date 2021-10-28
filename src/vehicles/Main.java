package vehicles;

public class Main {
    public static void main(String[] args) {

    //Initialization of object 'vehicles.Bus'
    Bus rumle = new Bus("Rumle", 113, 120);

    System.out.println("rumles speed is: " + rumle.getVelocity());
    rumle.accelerate(rumle.getVelocity());
    System.out.println("rumles speed is: " + rumle.getVelocity());
    rumle.accelerate(rumle.getVelocity());
    System.out.println("rumles speed is: " + rumle.getVelocity());

    }
}
