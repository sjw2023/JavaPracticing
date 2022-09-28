package constructortest;


public class ConstructThroughClass {
    
    AnotherClass ac;
    public ConstructThroughClass( AnotherClass ac ){
        System.out.println("ConstructThroughClass Constructor");
        this.ac = ac;
    }

    public static void main(String[] args) {
        AnotherClass ac = new AnotherClass();
        ConstructThroughClass ctc = new ConstructThroughClass(ac);
        // System.out.println(ctc.getClass());
        // System.out.println(ctc.ac.getClass());
    }
}
