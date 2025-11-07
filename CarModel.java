public class CarModel {
    private String make;
    private String model;
    private double  size;
    private double price;
    private String carNumber;
    private double speed;

    public CarModel(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public double getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
    public String getCarNumber() {
        return carNumber;
    }
    public double getSpeed() {
        return speed;
    }
    //Methods Section
    public double brake(double decreaseBy) {
       if (this.speed - decreaseBy >= 0) {
           this.speed -= decreaseBy;
       } else {
           this.speed -= 0;
       }
         return this.speed;
    }
    public double accelerate(double increaseBy) {
        this.speed += increaseBy;
        return this.speed;
    }
    public int gear(){
        if (this.speed >= 0 && this.speed <= 20) {
            return 1;
        } else if (this.speed > 20 && this.speed <= 40) {
            return 2;
        } else if (this.speed > 40 && this.speed <= 60) {
            return 3;
        } else if (this.speed > 60 && this.speed <= 80) {
            return 4;
        } else {
            return 5;
        }
    }
    // toString Method
    @Override
    public String toString() {
        return "Car make: " + make + ", model: " + model + ", size: " + size +
               ", price: " + price + ", car number: " + carNumber + ", speed: " + speed;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CarModel carModel = (CarModel) obj;
        return Double.compare(carModel.size, size) == 0 &&
               Double.compare(carModel.price, price) == 0 &&
               Double.compare(carModel.speed, speed) == 0 &&
               make.equals(carModel.make) &&
               model.equals(carModel.model) &&
               carNumber.equals(carModel.carNumber);
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = make.hashCode();
        result = 31 * result + model.hashCode();
        temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + carNumber.hashCode();
        temp = Double.doubleToLongBits(speed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
