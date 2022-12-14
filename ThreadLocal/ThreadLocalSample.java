package ThreadLocal;

import java.util.Random;

public class ThreadLocalSample {
    //ThreadLocal 객체 생성
    //Generic 타입, 연습 예제용으로 Integer를 사용하도록 생성하였음
    private final static ThreadLocal<Integer> local=new ThreadLocal<>();
    private static Random random;
    static{
        random=new Random();
    }

    public static Integer generateNumber(){
        int value=random.nextInt(45);
        //ThreadLocal.set()을 사용하여 값을 지정
        local.set(value);
        return value;
    }
    public static Integer get(){
        // ThreadLocal.get()을 사용하여 값을 꺼낸다
        return local.get();
    }
    public static void remove(){
        //ThreadLocal에 들어 있는 값을 제거
        local.remove();
    }

}
