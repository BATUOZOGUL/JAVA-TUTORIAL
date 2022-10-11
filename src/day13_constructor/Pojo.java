package day13_constructor;

public class Pojo {//icinde instance lear tanimladigimiz yer

     String name;
     String adress;
     int yas;

//default olarak her pojo class in bir pm siz const vardir
    //fakat pm li const urettiginiz za,man
    //pm siz conts ezilir yopk oluir

    public Pojo(String ad, String adres, int yas) {
        this.name = ad;
        this.adress = adres;
        this.yas = yas;
    }

    public Pojo() {
    }

    @Override
    public String toString() {
        return " "+
                 name  +" "
                + adress   +
                  yas
                ;
    }
}
