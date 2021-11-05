import java.util.*;
public class Program {

     Program(){}


    public static void main (String[] args){

         Animal d1 = new Dog();
         d1.setName("doggy");
         Vet v1 = new Vet();
         v1.treat(d1);

         Cat c1= new Cat();
         c1.setName("Kitty");
         Vet v2 = new Vet();
         v2.treat(c1);

    }
}
  