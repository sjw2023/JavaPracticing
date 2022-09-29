package constructortest;


public class ConstructThroughClass {
    
    AnotherClass ac;
    public ConstructThroughClass( AnotherClass ac ){
        System.out.println("ConstructThroughClass Constructor");
        this.ac = ac;
    }

    public static void main(String[] args) {
        //  기본 생성자 호출
        ConstructorPractice constructorPractice = new ConstructorPractice();
        //  매개변수 있는 생성자 호출
        ConstructorPractice constructorPractice2 = new ConstructorPractice(1);
        // AnotherClass ac = new AnotherClass();
        // ConstructThroughClass ctc = new ConstructThroughClass(ac);
        // // System.out.println(ctc.getClass());
        // // System.out.println(ctc.ac.getClass());
    }
}
