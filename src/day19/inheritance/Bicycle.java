package day19.inheritance;// Java program to illustrate the
// concept of inheritance
  
// base class
public class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;
  
    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
  
    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
  
    public void speedUp(int increment)
    {
        speed += increment;
    }
  
    // toString() method to print info of Bicycle

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}