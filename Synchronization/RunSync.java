package Synchronization;

public class RunSync {
//    public static void main(String[] args){
//        RunSync runSync=new RunSync();
//        runSync.runCommonCalc();
//    }
    public void runCommonCalc(){
        //쓰레드로 돌릴 계산기 클래스 객체 생성
        CommonCalculate calc=new CommonCalculate();
        //쓰레드생성 생성자 매개변수로 쓰레드에서 사용할 클래스 객체 받음, addFlag로 계산기 클래스가 더하기만 하도록 함
        ModifyAmountThread thread1=new ModifyAmountThread(calc,true);
        ModifyAmountThread thread2=new ModifyAmountThread(calc,true);
        //쓰레드를 시작하는 함수
        //1000더하기를 2번하니 기대값은 2000이다.
        thread1.start();
        thread2.start();
        try{
            //쓰레드가 종료될때까지 기다리는 함수
            thread1.join();
            thread2.join();
            //쓰레드 종료후 결과를 출력하도록하는 부분
            System.out.println("Final value is "+calc.getAmount());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
