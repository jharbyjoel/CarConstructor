package app;
import vehicle.Car;
public class Controller {
    public static void main(String[] args){

        Car c1 = new Car();
        c1.displayInfo();
        c1.classDisplayInfo();

        Car c2 = new Car("White",4);
        c2. displayInfo();

        Car c3 = new Car("Black",2);
        c3.displayInfo();

        Car c4 = new Car("Blue",4,38500,10432);
        c4.displayInfo();


    }
}
