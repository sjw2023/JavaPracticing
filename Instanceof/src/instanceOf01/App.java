package instanceOf01;

class Animal {}
class Bird extends Animal {}
class Penguin extends Bird {}

public class App {
    public static void main(String[] args) throws Exception {
        Animal animalObject = new Animal();
        Bird birdObject = new Bird();
        Penguin penguinObject = new Penguin();

        System.out.println( animalObject instanceof Animal );
        
        System.out.println( birdObject instanceof Animal );
        System.out.println( birdObject instanceof Bird );

        System.out.println( penguinObject instanceof Animal );
        System.out.println( penguinObject instanceof Bird );
        System.out.println( penguinObject instanceof Penguin );

        System.out.println( birdObject instanceof Object );

    }
}
