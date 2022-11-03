//SRP violated class

public class Dog {
    final static Boolean male = true;
    final static Boolean female = false;
    Boolean sex;

    void pee(){
        if(this.sex == male){
            //pee while standing with one leg
        }else{
            // pee with sitted pose
        }
    }
}

//make above class to follow SRP

abstract class Dog{
    abstract void pee();
}

class MaleDog extends Dog{
    void pee(){
        //pee while standing with one leg
    }
}

class FemaleDog extends Dog{
    void pee(){
        //pee while sitting on the ground
    }
}
