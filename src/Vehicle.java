public class Vehicle {
    private int currentSpeed;
    private int maxSpeed;
    private int fuel;

    public Vehicle (int currentSpeed, int maxSpeed){
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.fuel = 100;
    }
    public Vehicle (int currentSpeed, int maxSpeed,int fuel){
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        if(fuel<=100){
            this.fuel = fuel;
        }else{
            System.out.println("Fuel amount cannot exceed 100% so it has been automatically set to 100%");
            this.fuel = 100;
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
