package ThreadLocal;

public class LocalUserThread extends Thread {
    //ThreadLocalSample을 사용하여 스레드실행 매소드를 만들 클래스
    public void run(){
        //ThreadLocal에 임의의 변수를 생성하고 리턴
        int value=ThreadLocalSample.generateNumber();
        System.out.println(this.getName()+" LocalUserThread value="+value);

        //다른 로직을 실행하는 객체로 숫자 출력
        OtherLogic otherLogic=new OtherLogic();
        otherLogic.printMyNumber();
        //ThreadLocal의 값을 제거
        ThreadLocalSample.remove();
    }
}
