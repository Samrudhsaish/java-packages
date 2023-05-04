import java.util.Scanner;

public class Vehicle {
    String vehicleType;
    String modelType;
    int noOfSeats=6;
    String color;
    int noOfWheels;
    int noOfDoors=1;
    int price;
    double speed;
    boolean isDrivable=true;
    public void go() {
        System.out.println("Vehicle is moving");
    }
    public void stop() {
        System.out.println("Vehicle is stopped");
    }
    public void honk() {
        System.out.println("tutu tutu");
    }
    public int getNoOfSeats(){
        int res=this.noOfSeats;
        System.out.println(res);
        return res;

    }
}
    class Car extends Vehicle {
        int noOfDoors = 4;
        int noOfWheels=4;
        public void showDetails(){
             vehicleType="car";
             modelType="sports";
             System.out.println("modelType  is " + vehicleType);
        }

        public void sumOfDoors() {
            System.out.println(super.noOfDoors + this.noOfDoors);
        }
        public void sumOfWheels(){
            System.out.println(this.noOfWheels);
        }

        @Override
        public void honk() {
            System.out.println("not saying tutu tutu");
        }

        public static void main(String[] args) {
            Car c = new Car();
            c.getNoOfSeats();
            c.honk();
            c.go();
            c.stop();
            c.sumOfDoors();
            c.sumOfWheels();
            c.showDetails();

        }
    }

