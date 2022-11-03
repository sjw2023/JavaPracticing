package constructortest;


public class ConstructThroughClass {
    
    //  클래스 내부의 다른 클래스
    //  private이라 외부에서 접근 불가
    private AnotherClass ac;
    
    //  매개변수 없는 생성자
    public ConstructThroughClass(){
        System.out.println(getClass() + " : 매개변수 없는 생성자 호출");
    }
    //  클래스 생성자릁 통해 주입
    public ConstructThroughClass( AnotherClass ac ){
        System.out.println( getClass() + " : 생성자 주입 통해 내부 필드 클래스 생성");
        this.ac = ac;
    }
    //  anotherClass의 프린트 함수 호출
    public void doSomething(){
        ac.print();
    }

    public static void main(String[] args) {
        //  기본 생성자 호출
        ConstructorPractice constructorPractice = new ConstructorPractice();
        //  매개변수 있는 생성자 호출
        ConstructorPractice constructorPractice2 = new ConstructorPractice(1);
        //  생성자를 메소드로 감싸서 객체 리턴
        //  ConstructorPractice constructorPractice3 = constructorPracticeObjectReturnMethod();


        //  내부 필드 없이 객체 생성
        ConstructThroughClass ctc = new ConstructThroughClass();
        //  내부 필드 객체 할당 하지 않은채료 내부필드 메소드 호출
        //  ctc.doSomething(); //   에러 발생
        //  객체 내부의 필드 초기화를 위여 다른 클래스 객체 생성.
        AnotherClass ac = new AnotherClass();
        ConstructThroughClass ctc2 = new ConstructThroughClass(ac);
        //  내부 필드 객체 할당후 내부 필드 메소드 호출
        ctc2.doSomething(); //  Anotherclass.print()호출 성공.

        ClassWithListOfClasses cwloc = cwloc(ac);
        cwloc.print();
        
    }
    //매개변수 없는 생성자를 호출하여 객체를 리턴하는 메소드
    public ConstructorPractice constructorPracticeObjectReturnMethod(){
        return new ConstructorPractice();
    }
}
