public class Car extends Vehicle{
    private String carName, carColor;
    public Car(String carName,String carColor, int currentSpeed,int maxSpeed){
        super(currentSpeed,maxSpeed);
        this.carName = carName;
        this.carColor = carColor;
    }
    public Car(String carName,String carColor, int currentSpeed,int maxSpeed,int fuel){
        super(currentSpeed,maxSpeed,fuel);
        this.carName = carName;
        this.carColor = carColor;
    }
    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public int getFuel(){
        return super.getFuel();
    }
}
