package day19.inheritance;

// derived class
public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info

     /*
    Method Overriding: Method Overriding is achievable only through Inheritance.
    It is one of the ways by which java achieves Run Time Polymorphism.
     */
    //In practice, inheritance and polymorphism are used together in java to achieve fast performance
    // and readability of code.

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}