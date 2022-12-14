import Synchronization.RunSync;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Synchronization------");
        RunSync runSync=new RunSync();
        //Run Thread method 10 times
        for(int loop=0; loop<5; loop++) {
            runSync.runCommonCalc();
        }
    }
}
