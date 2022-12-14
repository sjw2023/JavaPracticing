package ThreadLocal;

public class OtherLogic {
    public void printMyNumber(){
        //ThreadLocal은 thread간에 공유가 되는 변수이므로 별다른 전달방법 없이 사용이 가능한 모습
        System.out.println(Thread.currentThread().getName()+" OtherLogic value="+ThreadLocalSample.get());
    }
}
