package constructor03;

//test constructor with parameter & default constructor ( it should fail since there is no declaration of defulat constructor. )
public class App02 {
    public static void main(String[] args) {
        //Constructor with parameter
        Animal pororo = new Animal("pororo");
        //Default Constructor
        Animal noName = new Animal();
    }
}