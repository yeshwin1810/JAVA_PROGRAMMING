package oops;

public class CarRental {
    private int carId;
    private String carType;
    private float rent;
    public CarRental(int carId, String carType) {
        this.carId = carId;
        this.carType = carType;
        this.rent = getRent(); 
    }
    public void getCar(int carId, String carType) {
        this.carId = carId;
        this.carType = carType;
        this.rent = getRent(); 
    }
    public float getRent() {
        switch (carType.toLowerCase()) {
            case "smallcar":
                return 300000.0f; 
            case "sedan":
                return 50.0f;
            case "suv":
                return 70.0f;
            default:
                return 0.0f; 
        }
    }
    public void showCar() {
        System.out.println("Car ID: " + carId);
        System.out.println("Car Type: " + carType);
        System.out.println("Rent: $" + rent);
    }
    public static void main(String[] args) {
        CarRental car1 = new CarRental(101, "SmallCar");
        car1.showCar();
        car1.getCar(102, "SUV");
        car1.showCar();
    }
} 

// yeshwin 
// yeshwin
// yeshwin
// yeshwin