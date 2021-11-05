public class Vet {

     Vet(){
        System.out.println("Vet Instance Created");
     }


    public void treat(Dog a){
        System.out.println("Dog");
        a.eat();
        a.bark();

    }

//    public void treat(Cat a){
//        System.out.println("Cat");
//        a.eat();
//
//    }

     public void treat(Animal a){
         System.out.println("animal");
         a.eat();
         ((Dog)a).bark();


     }


}
