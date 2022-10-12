package day13_constructor;

public class ObjectCreationFromPojoClass {


    public static void main(String[] args) {
        Pojo obj=new Pojo();//pmsiz const

        obj.name="adam";
        obj.adress="asd";
        obj.yas=25;
        System.out.println("obj = " + obj);

        Pojo objPmli=new Pojo
                ("batu","hollanda",30);

        System.out.println("objPmli = " + objPmli);




    }
}
