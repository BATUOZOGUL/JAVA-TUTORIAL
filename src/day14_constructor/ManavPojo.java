package day14_constructor;

public class ManavPojo {//TODO suan atil bu kullanamdik

    String urun1 ;
    String urun2;
    String urun3 ;
    String urun4;
    String urun5;

    public ManavPojo(String urun1, String urun2, String urun3, String urun4, String urun5) {
        this.urun1 = urun1;
        this.urun2 = urun2;
        this.urun3 = urun3;
        this.urun4 = urun4;
        this.urun5 = urun5;
    }
    public ManavPojo(String urun1, String urun2, String urun3) {
        this.urun1 = urun1;
        this.urun2 = urun2;
        this.urun3 = urun3;

    }

    public ManavPojo() {
    }


    @Override
    public String toString() {
        return "ManavPojo{" +
                "urun1='" + urun1 + '\'' +
                ", urun2='" + urun2 + '\'' +
                ", urun3='" + urun3 + '\'' +
                ", urun4='" + urun4 + '\'' +
                ", urun5='" + urun5 + '\'' +
                '}';
    }

}
