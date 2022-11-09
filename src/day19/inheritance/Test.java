package day19.inheritance;

// driver class
public class Test {
    public static void main(String args[])
    {
  
        MountainBike mb =
                new MountainBike
                        (3, 100,
                                25);
        System.out.println(mb);

        System.out.println(mb.gear);
        System.out.println(mb.speed);
        System.out.println(mb.seatHeight);
    }
}