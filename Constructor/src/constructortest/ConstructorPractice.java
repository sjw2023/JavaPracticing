package constructortest;

public class ConstructorPractice {
    //클래스의 상태( 필드 )
    int someVariable;

    //매개변수 없는 생성자 정의
    public ConstructorPractice (){
        System.out.println(getClass() + " : 매개변수 없는 생성자 호출.");
    };

    //매개변수를 가진 생성자 정의
    public ConstructorPractice ( int argument ){
        System.out.println( getClass() + " : 매개변수를 가진 생성자 호출, 매개변수는 " + argument);
        this.someVariable = argument;
    }


}
