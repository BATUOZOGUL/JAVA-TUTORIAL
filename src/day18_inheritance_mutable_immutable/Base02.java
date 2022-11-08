package day18_inheritance_mutable_immutable;

//task Constructor Chaining to other class using super() keyword :

// Java program to illustrate Constructor Chaining to
// other class using super() keyword
public class Base02 {

    String name;

     Base02() {
      this("");
         System.out.println("no args const base class");
    }

     Base02(String name) {
         this.name = name;
         System.out.println("pmli const cagrildi base class dan");

    }
}

