public class Animal {

    private String name;
    private  String mood;


    Animal(){
        System.out.println("Animal Instance Created");
    }


    public void eat(){
        System.out.println(this.name + " eats");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
