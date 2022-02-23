package vehicle;
import java.util.Random;
public class Car {
    private static int vehicleCounter = 2000;
    private static final String CAR_FACTORY_ID = "Norwood";
    private String carID;
    private String color;
    private String factory;
    private int numberOfDoors;
    private double price;
    private int mileage;
    public String doYouLikeIt;


    // beginning of constructors


    public Car(){
        carID = "VIN-" + CAR_FACTORY_ID + "-" + vehicleCounter;
        color = "Red";
        factory = "Norwood";
        numberOfDoors = 2;
        price = (int) (Math.random() * 10000 + 35000);
        mileage = 0;
        doYouLikeIt = "yes";
        vehicleCounter++;



    }

    public Car(String color , int numberOfDoors){

    this();
    this.color = color;
    this.numberOfDoors = numberOfDoors;

    }

    public Car(String color , int numberOfDoors , double price , int mileage){
    this.color = color;
    this.numberOfDoors = numberOfDoors;
    this.price = price;
    this.mileage = mileage;




    }

    // end of constructors


    public static int getVehicleCounter;

    public static void setVehicleCounter(int vehicleCounter) {


    }

    public String getCarID (){
        return carID;

    }

    public String getColor () {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getFactory () {
        return factory;
    }

    public int getNumberOfDoors (){
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;

    }
    public double getPrice(){
        return price;
    }

    public static void classDisplayInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Car Class Info");
        System.out.println("-------------------------------------");
        System.out.println("vehicleCounter: " + vehicleCounter);
        System.out.println("CAR_FACTORY_ID: " + CAR_FACTORY_ID);
    }

    public void displayInfo(){
    System.out.println("-------------------------------------");
    System.out.println("Car Info");
    System.out.println("-------------------------------------");
    System.out.println("CarID: " + carID);
    System.out.println("Factory: " + factory);
    System.out.println("Number of Doors: " + numberOfDoors);
    System.out.println("Color: " + color);
    System.out.println("Mileage: " + mileage);
    System.out.printf("Price:$%.2f" , price);
    System.out.println("");
    System.out.println("Do you like it: " + doYouLikeIt);
    }






}
