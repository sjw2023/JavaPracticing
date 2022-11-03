package Abstract.src.method02;

public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[3];

        animals[0] = new Rat();
        animals[1] = new Cat();
        animals[2] = new Chick();

        for (Animal animal : animals) {
            animal.bark();
        }
    }
}
