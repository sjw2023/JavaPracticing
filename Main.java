import Synchronization.RunSync;
import ThreadLocal.LocalUserThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Synchronization------");
        RunSync runSync=new RunSync();
        //Run Thread method 10 times
        for(int loop=0; loop<5; loop++) {
            runSync.runCommonCalc();
        }

        System.out.println("------ThreadLocal------");
        LocalUserThread thread1=new LocalUserThread();
        LocalUserThread thread2=new LocalUserThread();
        LocalUserThread thread3=new LocalUserThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
